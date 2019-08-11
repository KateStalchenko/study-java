package main.com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    private static final String MINE = "\\uD83D\\uDCA3";
    private static final String FLAG = "\\uD83D\\uDEA9";

    private int countMinesOnField;
    private int countFlags;

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
                    countMinesOnField++;
                } else {
                    initializeGameField(row, column, false);
                }
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private void initializeGameField(int row, int column, boolean isMine) {
        gameField[row][column] = new GameObject(column, row, isMine);
        setCellColor(column, row, Color.BEIGE);
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

    private void openTile(int x, int y) {
        gameField[y][x].isOpen = true;

        if (gameField[y][x].isMine) {
            setCellValue(x, y, MINE);
        } else {
            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            setCellColor(x, y, Color.GREEN);

            if (gameField[y][x].countMineNeighbors == 0 /*&& !gameField[y][x].isMine*/){
                ArrayList<GameObject> neighborsOfCell = getNeighbors(gameField[y][x]);
                for (GameObject cell: neighborsOfCell){
                    if (!cell.isOpen){
                        openTile(cell.x, cell.y);
                    }
                }
                setCellValue(x, y, "");
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        super.onMouseLeftClick(x, y);
        openTile(x, y);
    }
}