package main.tasks.task003.task0318;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solution {
    public static void main (String[] strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        System.out.printf("%s захватит мир через %s лет. Му-ха-ха!", name,age);
    }
}
