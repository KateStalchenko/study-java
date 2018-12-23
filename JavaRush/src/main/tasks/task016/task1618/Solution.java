package main.tasks.task016.task1618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Katsiaryna Stalchanka
 * @since 23-Dec-18
 */
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    private static class Read3Strings extends Thread {
        StringBuilder stringBuilder = new StringBuilder();

        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    stringBuilder.append(reader.readLine());
                } catch (IOException e) {
                }
                if (i != 2) {
                    stringBuilder.append(" ");
                }
            }
        }

        public void printResult(){
            System.out.println(stringBuilder.toString());
        }
    }

    //add your code here - добавьте код тут
}
