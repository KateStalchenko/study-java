package main.tasks.task016.task1611;

/**
 * @author Katsiaryna Stalchanka
 * @since 22-Dec-18
 */
public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            final int number = numSeconds;
            try {
                while (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (number == 3) {
                System.out.print("Марш!");
            } else if (number == 4) {
                System.out.print("Прервано!");
            }
        }
    }
}

