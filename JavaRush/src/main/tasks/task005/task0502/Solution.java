package main.tasks.task005.task0502;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person1 = new Person();
        person1.initialize("Tolik", 21);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;
        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }
}