package com.javarush.games.minesweeper;

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
                    setCellColor(row, column, Color.RED);
                    countMinesOnField = countMinesOnField++;
                } else {
                    initializeGameField(row, column, false);
                    setCellColor(row, column, Color.BEIGE);
                }
            }
        }

        countMineNeighbors();
    }

    private void initializeGameField(int row, int column, boolean isMine) {
        gameField[row][column] = new GameObject(column, row, isMine);
    }

    private void countMineNeighbors() {
        ArrayList<GameObject> neighbors;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (!gameField[i][j].isMine) {

                    neighbors = getNeighbors(gameField[i][j]);

                    for (GameObject gameObject : neighbors) {
                        if (gameObject.isMine) {
                            gameObject.countMineNeighbors += 1;
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

        if (gameObject.x == 0 && gameObject.y == 0) {
            neighbors.add(gameField[row][column + 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column + 1]);
            return neighbors;
        } // левый верхний

        if (gameObject.x == 0 && gameObject.y == gameField.length - 1) {
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column + 1]);
            neighbors.add(gameField[row][column + 1]);
            return neighbors;
        } // левый нижний

        if (gameObject.x == gameField.length - 1 && gameObject.y == gameField.length - 1) {
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column - 1]);
            neighbors.add(gameField[row][column - 1]);
            return neighbors;
        } // правый нижний

        if (gameObject.x == gameField.length - 1 && gameObject.y == 0) {
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column - 1]);
            return neighbors;
        } // правый верхний

        if (gameObject.y == 0) {
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row][column + 1]);
            neighbors.add(gameField[row + 1][column - 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column + 1]);
            return neighbors;
        } //верхний ряд

        if (gameObject.y == SIDE) {
            neighbors.add(gameField[row - 1][column - 1]);
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column + 1]);
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row][column + 1]);
            return neighbors;
        } //нижний ряд

        if (gameObject.x == 0) {
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column + 1]);
            neighbors.add(gameField[row][column + 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column + 1]);
            return neighbors;
        } //левый бок

        if (gameObject.x == SIDE) {
            neighbors.add(gameField[row - 1][column]);
            neighbors.add(gameField[row - 1][column - 1]);
            neighbors.add(gameField[row][column - 1]);
            neighbors.add(gameField[row + 1][column]);
            neighbors.add(gameField[row + 1][column - 1]);
            return neighbors;
        } //правый бок

        neighbors.add(gameField[row - 1][column - 1]);
        neighbors.add(gameField[row - 1][column]);
        neighbors.add(gameField[row - 1][column + 1]);
        neighbors.add(gameField[row][column - 1]);
        neighbors.add(gameField[row][column + 1]);
        neighbors.add(gameField[row + 1][column - 1]);
        neighbors.add(gameField[row + 1][column]);
        neighbors.add(gameField[row + 1][column + 1]);

        return neighbors;
    }
}
