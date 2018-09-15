package main.tasks.task003.task0310;

public class solution {

    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        long result = a * b * c * 1000;
        return result;
    }
}
