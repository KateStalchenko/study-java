package main.tasks.task002.task0214;

public class Solution {
    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a>b)
        {
            return b;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
