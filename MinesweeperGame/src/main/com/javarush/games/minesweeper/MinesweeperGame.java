package main.com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    private int countMinesOnField;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int row = 0; row < SIDE; row++) {
            for (int column = 0; column < SIDE; column++) {
                if (getRandomNumber(10) < 1) {
                    initializeGameField(row, column, true);
                    setCellColor(column, row, Color.RED);
                    countMinesOnField++;
                } else {
                    initializeGameField(row, column, false);
                    setCellColor(column, row, Color.BEIGE);
                }
            }
        }
        countMineNeighbors();
    }

    private void initializeGameField(int row, int column, boolean isMine) {
        gameField[row][column] = new GameObject(column, row, isMine);
    }

    private void countMineNeighbors() {
        for (int row = 0; row < SIDE; row++) {
            for (int column = 0; column < SIDE; column++) {
                if (!gameField[row][column].isMine) {
                    ArrayList<GameObject> neighbors = getNeighbors(gameField[row][column]);
                    for (GameObject gameObject : neighbors) {
                        if (gameObject.isMine) {
                            gameField[row][column].countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private ArrayList<GameObject> getNeighbors(GameObject gameObject) {
        int row = gameObject.y;
        int column = gameObject.x;

        ArrayList<GameObject> neighbors = new ArrayList<>();

        if (row == 0) {
            if (column == 0) {
                neighbors.add(gameField[row][column + 1]);
                neighbors.add(gameField[row + 1][column]);
                neighbors.add(gameField[row + 1][column + 1]);
            } else if (column == SIDE - 1) {
                neighbors.add(gameField[row][column - 1]);
                neighbors.add(gameField[row + 1][column - 1]);
                neighbors.add(gameField[row + 1][column]);
            } else {
                neighbors.add(gameField[row][column - 1]);
                neighbors.add(gameField[row][column + 1]);
                neighbors.add(gameField[row + 1][column - 1]);
                neighbors.add(gameField[row + 1][column]);
                neighbors.add(gameField[row + 1][column + 1]);
            }
        } else if (row == SIDE - 1) {
            if (column == 0) {
                neighbors.add(gameField[row - 1][column]);
                neighbors.add(gameField[row - 1][column + 1]);
                neighbors.add(gameField[row][column + 1]);
            } else if (column == SIDE - 1) {
                neighbors.add(gameField[row - 1][column - 1]);
                neighbors.add(gameField[row - 1][column]);
                neighbors.add(gameField[row][column - 1]);
            } else {
                neighbors.add(gameField[row][column - 1]);
                neighbors.add(gameField[row][column + 1]);
                neighbors.add(gameField[row - 1][column - 1]);
                neighbors.add(gameField[row - 1][column]);
                neighbors.add(gameField[row - 1][column + 1]);
            }
        } else if (column == 0) {
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column + 1]);
            neighbors.add(gameField[row][column + 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column + 1]);

        } else if (column == SIDE - 1) {
            neighbors.add(gameField[row - 1][column - 1]);
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row + 1][column - 1]);
            neighbors.add(gameField[row + 1][column]);
        } else {
            neighbors.add(gameField[row - 1][column - 1]);
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column + 1]);
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row][column + 1]);
            neighbors.add(gameField[row + 1][column + 1]);
            neighbors.add(gameField[row + 1][column - 1]);
            neighbors.add(gameField[row + 1][column]);
        }
        return neighbors;
    }
}