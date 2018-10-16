package main.tasks.task009.task0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userDate = reader.readLine();
        DateFormat parseToDate = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfUser = parseToDate.parse(userDate);
        SimpleDateFormat formats = new SimpleDateFormat("MMMM dd,yyy");
        System.out.println(formats.format(dateOfUser));
    }
}
