package main.tasks.task016.task1615;

/**
 * @author Katsiaryna Stalchanka
 * @since 23-Dec-18
 */
public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        Thread.sleep(2500);
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
        Thread.sleep(2500);
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp = 1;

        @Override
        public void run() {
            try {
                while (countIndexUp <= 5) {
                    System.out.println(toString());
                    ++countIndexUp;
                    if (countIndexUp > 5) {
                        Thread.sleep(500);
                        return;
                    }
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return String.format("%s: %d ", Thread.currentThread().getName(), countIndexUp);
        }
    }

    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}