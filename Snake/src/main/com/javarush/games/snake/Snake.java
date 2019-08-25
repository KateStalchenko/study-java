package main.com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    private Direction direction = Direction.LEFT;

    public boolean isAlive = true;

    private List<GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void setDirection(Direction direction) {
        if ((this.direction == Direction.UP && direction == Direction.DOWN) ||
                (this.direction == Direction.DOWN && direction == Direction.UP) ||
                (this.direction == Direction.LEFT && direction == Direction.RIGHT) ||
                (this.direction == Direction.RIGHT && direction == Direction.LEFT)) {
            return;
        }

        if ((this.direction == Direction.LEFT && snakeParts.get(0).x == snakeParts.get(1).x)||
                (this.direction == Direction.RIGHT && snakeParts.get(0).x == snakeParts.get(1).x)||
                (this.direction == Direction.UP && snakeParts.get(0).y == snakeParts.get(1).y)||
                (this.direction == Direction.DOWN && snakeParts.get(0).y == snakeParts.get(1).y)){
            return;
        }
        this.direction = direction;
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();

        if (newHead.x < 0 || newHead.y < 0 || newHead.x >= SnakeGame.WIDTH || newHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
            return;
        }

        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        }
        snakeParts.add(0, newHead);

        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
            return;
        }

        removeTail();
    }

    public GameObject createNewHead() {
        switch (direction) {
            case LEFT:
                return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
            case RIGHT:
                return new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
            case UP:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
            case DOWN:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        }
        return null;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject snakePart : snakeParts) {
            if (gameObject.x == snakePart.x && gameObject.y == snakePart.y) {
                return true;
            }
        }
        return false;
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                setSnakeColor(game, i, HEAD_SIGN);
            } else {
                setSnakeColor(game, i, BODY_SIGN);
            }
        }

    }

    private void setSnakeColor(Game game, int i, String bodySign) {
        if (!isAlive) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, bodySign, Color.RED, 75);
        } else {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, bodySign, Color.AQUA, 75);
        }
    }

    public int getLength(){
        return snakeParts.size();
    }
}
