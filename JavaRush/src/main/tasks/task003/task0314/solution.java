package main.tasks.task003.task0314;

public class solution {
    public static void main (String[] strings){
        int number = 1;
        while (number<10)
        {
            for (int i = 1; i<10; i++)
            {
                System.out.print(number*i + " ");
            }
            System.out.println();
            number++;
        }
    }
}
