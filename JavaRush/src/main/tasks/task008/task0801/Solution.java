package main.tasks.task008.task0801;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("женьшень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");

        for (String item: fruits){
            System.out.println(item);
        }
    }
}
