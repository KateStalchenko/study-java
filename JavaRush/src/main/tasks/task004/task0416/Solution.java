package main.tasks.task004.task0416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int sum = 0;
        while (num!=-1) {
            num = Integer.valueOf(reader.readLine());
            sum +=num;
        }
        System.out.println(sum);
    }
}
