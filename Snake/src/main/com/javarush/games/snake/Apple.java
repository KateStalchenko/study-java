package main.com.javarush.games.snake;

import com.javarush.engine.cell.*;

class Apple extends GameObject {
    private static final String APPLE_SIGN = "\uD83C\uDF4E";

    private boolean isAlive = true;

    Apple(int x, int y) {
        super(x, y);
    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setAlive(boolean alive) {
        isAlive = alive;
    }

    void draw(Game game){
        game.setCellValueEx(x,y, Color.NONE, APPLE_SIGN, Color.GREEN, 75);
    }

}
