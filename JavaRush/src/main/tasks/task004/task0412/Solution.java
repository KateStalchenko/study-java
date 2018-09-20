package main.tasks.task004.task0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main (String[] strings) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(read.readLine());
        if (number>0 && number%2==0)
        {
            System.out.println("положительное четное число");
        }
        else if (number>0 && number%2!=0)
        {
            System.out.println("положительное нечетное число");
        }
        else if (number<0 && number%2!=0)
        {
            System.out.println("отрицательное нечетное число");
        }
        else if (number<0 && number%2==0)
        {
            System.out.println("отрицательное четное число");
        }
        else
        {
            System.out.println("ноль");
        }
    }
}
