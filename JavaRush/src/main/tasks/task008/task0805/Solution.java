package main.tasks.task008.task0805;

import java.util.HashSet;
import java.util.Random;

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Random rnd = new Random();
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i + rnd.nextInt(50));
        }
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> delete = new HashSet<>();
        for (int item : set) {
            if (item > 10) {
                delete.add(item);
            }
        }

        for (int obj : delete) {
            set.remove(obj);
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> result = createSet();
        for (int item : result) {
            System.out.print(item + " ");
        }
        System.out.println("\r\n");
        removeAllNumbersMoreThan10(result);
        for (int item : result) {
            System.out.println(item);
        }

    }
}