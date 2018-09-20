package main.tasks.task004.task0410;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(reader.readLine());
        int number2 = Integer.valueOf(reader.readLine());
        int number3 = Integer.valueOf(reader.readLine());

        if (number1==number2)
        {
            System.out.println("3");
        }
        else if (number1==number3)
        {
            System.out.println("2");
        }
        else if (number2==number3) {
            System.out.println("1");
        }
    }
}
