package main.tasks.task004.task0401;

public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20; // it's necessary to add THIS
            System.out.println("Age in adjustAge() is: " + this.age); // it's necessary to add THIS
        }
    }
}
