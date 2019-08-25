package main.com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private static final int GOAL = 28;

    private Snake snake;
    private Apple apple;

    private int turnDelay;
    private int score;

    private boolean isGameStopped;

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            createNewApple();
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }

        if (!snake.isAlive) {
            gameOver();
        }

        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case SPACE:
                if (isGameStopped) {
                    createGame();
                }
                break;
            case LEFT:
                snake.setDirection(Direction.LEFT);
                break;
            case RIGHT:
                snake.setDirection(Direction.RIGHT);
                break;
            case DOWN:
                snake.setDirection(Direction.DOWN);
                break;
            default:
                snake.setDirection(Direction.UP);
                break;
        }
    }

    private void createGame() {
        score = 0;
        setScore(score);
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        drawScene();
    }

    private void drawScene() {
        for (int row = 0; row < WIDTH; row++) {
            for (int column = 0; column < HEIGHT; column++) {
                setCellValueEx(row, column, Color.DARKGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void createNewApple() {
        int width = getRandomNumber(WIDTH);
        int height = getRandomNumber(HEIGHT);
        Apple newApple = new Apple(width, height);

        while (snake.checkCollision(newApple)) {
            width = getRandomNumber(WIDTH);
            height = getRandomNumber(HEIGHT);
            newApple = new Apple(width, height);
        }

        apple = newApple;
    }

    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "Game over.", Color.CADETBLUE, 75);
    }

    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "WIN!!!", Color.CADETBLUE, 75);
    }
}