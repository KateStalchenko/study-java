package main.tasks.task009.task0909;

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //напишите тут ваш код
        }
    }
}
