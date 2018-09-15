package main.tasks.task003.task0304;

public class solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double decreeseNumber = (double) i + ((double) i * 10 / 100);
        return decreeseNumber;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));

    }
}
