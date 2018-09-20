package main.tasks.task006.task0601;

public class Solution {
    public static void main(String[] args) {

    }

    public class Cat {
        //напишите тут ваш код
        protected void finalize() throws Throwable{
            System.out.println("destriyed");
        }
    }
}
