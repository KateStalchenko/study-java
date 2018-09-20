package main.tasks.task006.task0603;

import java.io.*;

public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
