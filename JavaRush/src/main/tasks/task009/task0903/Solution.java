package main.tasks.task009.task0903;

public class Solution {
    public static void main(String[] args) throws Exception {

        method1();

    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        int length = Solution.getStackTraceDeep();
        System.out.println(length);
        return stackTraceElements[2].getLineNumber();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace().length;
    }
}

