package tasks.task002.task0211;

/*
Самое нужное число
*/
public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + x; //  y 1

        x = x * 2; //  x 2
        y = y + x; //

        x = x * 2; // x = 4
        //y = y + x; // y = 5

        x = x * 2; // x
        //y = y + x; // y = 9

        x = x * 2; // x = 8
        y = y + x; // y = 17

        System.out.println(y);
    }
}
