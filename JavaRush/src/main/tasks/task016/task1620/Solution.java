package main.tasks.task016.task1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Katsiaryna Stalchanka
 * @since 23-Dec-18
 */
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) throws InterruptedException {
        threads.add(new FifthThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());

        threads.get(4).start();
    }

    public static class FirstThread implements Runnable {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class SecondThread extends Thread {
        public void run() {
            try {
                while (!isInterrupted()) {
                    Thread.sleep(500);
                }
                throw new InterruptedException("InterruptedException");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThirdThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class FourthThread extends Thread implements Message {
        @Override
        public void showWarning() {
            if (this.isAlive()) {
                this.interrupt();
            }
        }

        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class FifthThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum;
        String string;

        @Override
        public void run() {
            try {
                while (true) {
                    string = reader.readLine();
                    if (string.equals("N")){
                        break;
                    }
                    numbers.add(Integer.parseInt(string));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
