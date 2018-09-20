package main.tasks.task004.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rectangle = Integer.valueOf(reader.readLine());
        for (int i = 0; i <= rectangle; i++)
        {
            for (int j = 0; j<i; j++ )
            {
                System.out.print("8");
            }
            System.out.print("\r\n");
        }
    }
}
