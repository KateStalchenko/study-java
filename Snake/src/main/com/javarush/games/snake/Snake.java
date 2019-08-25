package main.com.javarush.games.snake;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    private Direction direction = Direction.LEFT;

    private boolean isAlive = true;

    private List<GameObject> snakeParts = new ArrayList<>();

    Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setDirection(Direction direction) {
        if ((this.direction == Direction.UP && direction == Direction.DOWN) ||
                (this.direction == Direction.DOWN && direction == Direction.UP) ||
                (this.direction == Direction.LEFT && direction == Direction.RIGHT) ||
                (this.direction == Direction.RIGHT && direction == Direction.LEFT)) {
            return;
        }

        if ((this.direction == Direction.LEFT && snakeParts.get(0).x == snakeParts.get(1).x) ||
                (this.direction == Direction.RIGHT && snakeParts.get(0).x == snakeParts.get(1).x) ||
                (this.direction == Direction.UP && snakeParts.get(0).y == snakeParts.get(1).y) ||
                (this.direction == Direction.DOWN && snakeParts.get(0).y == snakeParts.get(1).y)) {
            return;
        }

        this.direction = direction;
    }

    void move(Apple apple) {
        GameObject newHead = createNewHead();

        isAlive = isSnakeAlive(newHead);

        snakeParts.add(0, newHead);

        setAppleAliveStatus(apple, newHead);

        removeTail();
    }

    private void setAppleAliveStatus(Apple apple, GameObject newHead) {
        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.setAlive(false);
        }
    }

    private boolean isSnakeAlive(GameObject snakeObject) {
        boolean isSnakeAlive = true;
        if (snakeObject.x < 0 || snakeObject.y < 0 || snakeObject.x >= SnakeGame.WIDTH || snakeObject.y >= SnakeGame.HEIGHT) {
            isSnakeAlive = false;
        }

        if (checkCollision(snakeObject)) {
            isSnakeAlive = false;
        }

        return isSnakeAlive;
    }

    private GameObject createNewHead() {
        int x = snakeParts.get(0).x;
        int y = snakeParts.get(0).y;

        switch (direction) {
            case LEFT:
                return new GameObject(x - 1, y);
            case RIGHT:
                return new GameObject(x + 1, y);
            case UP:
                return new GameObject(x, y - 1);
            case DOWN:
                return new GameObject(x, y + 1);
        }
        return null;
    }

    private void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    boolean checkCollision(GameObject snakeObject) {
        for (GameObject snakePart : snakeParts) {
            if (snakeObject.x == snakePart.x && snakeObject.y == snakePart.y) {
                return true;
            }
        }
        return false;
    }

    void draw(Game game) {
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

    int getLength() {
        return snakeParts.size();
    }
}
