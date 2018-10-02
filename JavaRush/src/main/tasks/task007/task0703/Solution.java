package main.tasks.task007.task0703;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            input.add(reader.readLine());
        }
        String max = input.get(0);
        String min = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i).length() > max.length()) {
                max = input.get(i);
            }
            if (input.get(i).length() < min.length()) {
                min = input.get(i);
            }
        }
        int indexOfmin = input.indexOf(min);
        int indexOfmax = input.indexOf(max);

        if (indexOfmin<indexOfmax){
            System.out.println(min);
        }
        else {
            System.out.println(max);
        }
    }
}
