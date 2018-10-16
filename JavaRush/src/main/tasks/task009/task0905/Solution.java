package main.tasks.task009.task0905;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement stackTraceElement[] = Thread.currentThread().getStackTrace();
        System.out.printf("%s: %s: %s",stackTraceElement[2].getClassName(), stackTraceElement[2].getMethodName(), s);
    }
}
