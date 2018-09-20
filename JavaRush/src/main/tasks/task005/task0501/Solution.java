package main.tasks.task005.task0501;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Tolya";
        cat1.weight = 15;
        cat1.strength = 2;
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.name = "Polya";
        cat2.weight = 5;
        cat2.strength = 3;
        cat2.age = 9;
        Cat cat3 = new Cat();
        cat3.name = "Olya";
        cat3.weight = 4;
        cat2.strength = 5;
        cat2.age = 1;

        System.out.println("Will cat 1 win?\r\n"
                + "Fight With cat 2");
        System.out.println(cat1.fight(cat2));
        System.out.println("Fight with cat 3\r\n"
        + cat1.fight(cat3));

    }
}
