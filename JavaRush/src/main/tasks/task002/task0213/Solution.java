package main.tasks.task002.task0213;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman Lise = new Woman();
        cat.owner = Lise;
        dog.owner = Lise;
        fish.owner = Lise;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
