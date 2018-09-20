package main.tasks.task006.task0602;

public class Solution {
    public static void main(String[] args) {

    }
    public class Cat {
        protected void finalize() throws Throwable {
            System.out.println("Cat was destroyed");
        }
        //напишите тут ваш код

    }

    class Dog {
        //напишите тут ваш код
        protected void finalize() throws Throwable {
            System.out.println("Dog was destroyed");
        }
    }

}
