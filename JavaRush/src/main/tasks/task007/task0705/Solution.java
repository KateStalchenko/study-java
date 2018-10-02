package main.tasks.task007.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> userWords = new ArrayList<>();
        String word;

        for (int i =0; i<10; i++){
            word = reader.readLine();
            userWords.add(word);
        }

        for (int i =0; i<userWords.size()-1; i++){
            if (userWords.get(i).length()<userWords.get(i+1).length()){
                continue;
            }
            else {
                System.out.print(i+1);
            }
        }
    }
}
