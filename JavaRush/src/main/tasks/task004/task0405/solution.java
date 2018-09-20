package main.tasks.task004.task0405;

public class solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        if (a<5)
        {
            System.out.println("Число меньше 5");
        }
        else if (a>5)
        {
            System.out.println("Число больше 5");
        }
        else
        {
            System.out.println("Число равно 5");
        }
    }
}
