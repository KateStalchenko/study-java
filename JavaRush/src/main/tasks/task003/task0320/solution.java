package main.tasks.task003.task0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.printf("%s зарабатывает $5,000. Ха-ха-ха!", name);
        
    }
}
