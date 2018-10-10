package main.tasks.task008.task0811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] words = s.toCharArray();
        int length = words.length;
        words[0]= Character.toUpperCase(words[0]);
        for (int i = 1; i < length-1; i++) {
            if (words[i] == ' '){
                words[i+1] = Character.toUpperCase(words[i+1]);
            }
        }
        System.out.println(words);
    }
}
