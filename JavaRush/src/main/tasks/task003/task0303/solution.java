package main.tasks.task003.task0303;

public class solution {

    public static void main(String[] args) {
        System.out.println(convertEurToUsd(25, 0.15));
        System.out.println(convertEurToUsd(15, 1.25));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur*course;
    }
}
