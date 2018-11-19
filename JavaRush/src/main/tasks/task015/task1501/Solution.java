package main.tasks.task015.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Katsiaryna Stalchanka
 * @since 18.11.2018
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        final String obj = "obj";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = "";
        for (int i = 0; i < 1; i++) {
            url = reader.readLine();
        }
        ArrayList<String> parameters = new ArrayList<>();
        String[] params = url.split("[?&]");
        String objValue = "";
        for (int i = 1; i < params.length; i++) {
            parameters.add(params[i].split("[=]")[0]);
            if (params[i].split("[=]")[0].equals(obj)) {
                objValue = params[i].split("[=]")[1];
            }
        }

        for (int i = 0; i < parameters.size(); i++) {
            if (i == (parameters.size() - 1)) {
                System.out.print(parameters.get(i));
            } else {
                System.out.print(parameters.get(i) + " ");
            }
        }

        if (!objValue.isEmpty()) {
            System.out.print("\r\n");
            if (isDigit(objValue) == true) {
                double objValueDouble = Double.parseDouble(objValue);
                alert(objValueDouble);
            } else {
                alert(objValue);
            }
        }
        else{
            return;
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static boolean isDigit(String obj) {
        if (!obj.isEmpty()) {
            try {
                double objValueDouble = Double.parseDouble(obj);
            } catch (Exception e) {
                return false;
            }
            return true;
        }
        return false;
    }
}

