package main.tasks.task005.task0505;

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Boris", 25, "Kurchatova 6");
        Man man2 = new Man("Andrei", 45, "Lenina 25");
        Woman woman1 = new Woman("Olga", 22, "Golovatskogo 1");
        Woman woman2 = new Woman("Daria", 14, "Slobodskaya 21");
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class  Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
