package main.tasks.task004.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.valueOf(reader.readLine());
        int num2 = Integer.valueOf(reader.readLine());
        int num3 = Integer.valueOf(reader.readLine());

        int count = 0;

        if (num1>0) count++;
        if (num2>0) count++;
        if (num3>0) count++;

        System.out.println(count);

    }
}
