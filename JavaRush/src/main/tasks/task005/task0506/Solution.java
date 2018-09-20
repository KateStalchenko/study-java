package main.tasks.task005.task0506;

import java.io.*;

/*
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());// it was necessary to add "Integer.valueOf()"

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}