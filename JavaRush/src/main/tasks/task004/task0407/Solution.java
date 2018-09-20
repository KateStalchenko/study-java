package main.tasks.task004.task0407;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(1);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if(month == 12 || month == 1 || month == 2)
        {
            System.out.println("зима");
        }

        else if (month>2 && month <6)
        {
            System.out.println("весна");
        }

        else if (month > 6 && month <9)
        {
            System.out.println("лето");
        }
        else System.out.println("осень");
    }
}
