package main.tasks.task008.task0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        List<Integer> numbers = new ArrayList<>();
        int quantity;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        quantity = Integer.parseInt(reader.readLine());
        for (int i = 0; i < quantity; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        return numbers;
    }
}
