package main.tasks.task007.task0702;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                evenNumber += house[i];
            } else {
                oddNumber += house[i];
            }
        }

        if (evenNumber > oddNumber) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}