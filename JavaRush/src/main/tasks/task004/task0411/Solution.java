package main.tasks.task004.task0411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberX = Integer.valueOf(reader.readLine());
        int numberY = Integer.valueOf(reader.readLine());
        if (numberX>0 && numberY >0)
        {
            System.out.println("1");
        }
        else if(numberX<0 && numberY>0)
        {
            System.out.println("2");
        }
        else if (numberX<0 && numberY<0)
        {
            System.out.println("3");
        }
        else
        {
            System.out.println("4");
        }
    }
}
