package main.tasks.task008.task0804;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> userNumbers = new ArrayList<>();
        int longCount = 1;
        int maxCount = 1;
        for (int i = 0; i < 10; i++) {
            userNumbers.add(Integer.valueOf(reader.readLine()));
        }
        for (int i = 0; i < userNumbers.size() - 1; i++) {

            if ( userNumbers.get(i).equals(userNumbers.get(i + 1))) {
                longCount++;
                maxCount = longCount > maxCount ? longCount : maxCount;
                continue;
            } else {
                longCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}
