package main.tasks.task007.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void printList(ArrayList<Integer> intList) {
        for (int item : intList) {
            System.out.print(item + " ");
        }
        System.out.print("\r\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> userNumbers = new ArrayList<>();
        ArrayList<Integer> divisionIntoThree = new ArrayList<>();
        ArrayList<Integer> divisionIntoTwo = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        int userNumber = 0;

        for (int i = 0; i < 20; i++) {
            userNumber = Integer.parseInt(reader.readLine());
            userNumbers.add(userNumber);
        }

        for (int num : userNumbers) {
            if (num % 3 == 0) {
                divisionIntoThree.add(num);
            }
            if (num % 2 == 0) {
                divisionIntoTwo.add(num);
            } else if (num % 3 != 0 && num % 2 != 0) {
                otherNumbers.add(num);
            }
        }

        Solution.printList(divisionIntoThree);
        Solution.printList(divisionIntoTwo);
        Solution.printList(otherNumbers);
    }
}
