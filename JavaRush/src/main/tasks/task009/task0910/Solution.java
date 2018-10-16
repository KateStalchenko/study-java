package main.tasks.task009.task0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> userNumbers = new ArrayList<>();
        int userNumber = 0;
        try {
            while (true) {
                userNumber = Integer.parseInt(reader.readLine());
                userNumbers.add(userNumber);
            }
        } catch (NumberFormatException e) {
            for (int num : userNumbers) {
                System.out.println(num);
            }
        }
    }
}
