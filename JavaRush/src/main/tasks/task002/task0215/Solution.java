package main.tasks.task002.task0215;

/*
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        //напишите тут ваш код
        double result = 0.17* weightEarth;
        return result;
    }
}