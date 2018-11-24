package main.tasks.task016.task1606;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Katsiaryna Stalchanka
 * @since 19-Nov-18
 */
public class Solution {
    public static int horseCount = 10;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != horseCount) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //add your implementation here - добавь свою реалзацию тут
        for (Horse horse:horses){
            if (horse.isFinished){
                finishedCount++;
            }
            else{
                System.out.printf("Waiting for %s\r\n", horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart() {
        List<Horse> horses = new ArrayList<Horse>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
