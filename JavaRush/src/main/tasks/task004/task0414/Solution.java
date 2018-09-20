package main.tasks.task004.task0414;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.valueOf(reader.readLine());
        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print("8");
            }
            System.out.print("\r\n");
        }
    }
}
