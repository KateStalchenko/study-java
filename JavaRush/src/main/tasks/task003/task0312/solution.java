package main.tasks.task003.task0312;

public class solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour)
    {
        return hour*3600;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(8));
    }
}
