package main.tasks.task009.task0904;

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace().length;
    }
}