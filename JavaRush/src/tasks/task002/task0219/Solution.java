package tasks.task002.task0219;

public class Solution {
    public static void print3(String s) {
        for (int i = 0; i<3; i++)
        {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
