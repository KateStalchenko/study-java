package tasks.task002.task0216;

public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        if (a>=b && b>=c) return c;
        if (b>=a && c>=a) return a;
        return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
