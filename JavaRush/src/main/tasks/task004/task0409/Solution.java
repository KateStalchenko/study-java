package main.tasks.task004.task0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(reader.readLine());
        int number2 = Integer.valueOf(reader.readLine());
        int number3 = Integer.valueOf(reader.readLine());
        int temp =0;
        int[] numbers = {number1, number2, number3};

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
            else continue;
        }
        List<Integer> arrInList = new ArrayList<>(numbers.length);
        for (int i: numbers)
        {
            arrInList.add(Integer.valueOf(i));
        }
        Collections.reverse(arrInList);

        System.out.println(arrInList);
    }
}
