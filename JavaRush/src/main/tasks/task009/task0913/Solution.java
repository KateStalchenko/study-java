package main.tasks.task009.task0913;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>();
        String temp;

        for (String str : array) {
            if (isNumber(str) == true) {
                intArr.add(Integer.parseInt(str));
            }
            strArr.add(str);
        }

        for (int i = 0; i < strArr.size() - 1; i++) {
            if (isGreaterThan(strArr.get(i), strArr.get(i + 1)) == true) {
                temp = strArr.get(i);
                strArr.set(i, strArr.get(i + 1));
                strArr.set(i+1, temp);
            }
        }

        Integer[] integers = strArr.toArray(new Integer[0]);
        Arrays.sort(integers);
        Collections.reverse(Arrays.asList(integers));

        ArrayList<Object> obj = new ArrayList<>();
        obj.addAll(strArr);
        obj.addAll(Arrays.asList(integers));

        for (Object o: obj){
            System.out.println(o);
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
