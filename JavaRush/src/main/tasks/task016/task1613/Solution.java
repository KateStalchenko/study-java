package main.tasks.task016.task1613;

/**
 * @author Katsiaryna Stalchanka
 * @since 23-Dec-18
 */
public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        public String toString() {
            return String.format("%s created", getName());
        }

        public void run(){
            if(createdThreadCount<count){
                System.out.println(new GenerateThread());
            }
        }
    }
}

