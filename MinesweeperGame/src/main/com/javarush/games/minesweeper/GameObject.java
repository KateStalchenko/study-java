package main.com.javarush.games.minesweeper;

class GameObject {
    int x;
    int y;

    int countMineNeighbors;

    boolean isMine;
    boolean isOpen;
    boolean isFlag;

    GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }
}
