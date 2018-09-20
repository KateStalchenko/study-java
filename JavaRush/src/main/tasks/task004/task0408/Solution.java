package main.tasks.task004.task0408;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());
        if (number > 0)
        {
            number *= 2;
        }
        else if (number < 0)
        {
            number -= 1;
        }
        else if (number == 0)
        {
            System.out.println("0");
        }

        System.out.println(number);
    }
}
