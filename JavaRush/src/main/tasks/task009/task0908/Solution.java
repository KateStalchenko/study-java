package main.tasks.task009.task0908;

public class Solution {

    public static void main(String[] args) {

        try{
            divisionByZero();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void divisionByZero(){
        int result = 8/0;
        System.out.println(result);
    }
}
