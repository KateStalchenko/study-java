package main.tasks.task016.task1602;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Katsiaryna Stalchanka
 * @since 19-Nov-18
 */
public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
            list.get(i).start();
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}