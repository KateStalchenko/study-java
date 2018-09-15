package main.tasks.task003.task0321;

public class solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
        System.out.println(sumDigitsInNumberThroughString(856));
    }

    public static int sumDigitsInNumberThroughString(int number) {
        //напишите тут ваш код
        int result = 0;
        String sNumber = Integer.toString(number);
        for (int i = 0; i < sNumber.length(); i++) {
            result += Integer.parseInt(String.valueOf(sNumber.charAt(i)));
        }
        return result;
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        while (number != 0)
        {
            result += number%10;
            number = number/10;
        }
        return result;
    }
}
