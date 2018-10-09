package main.tasks.task008.task0802;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> items = new HashMap<>();
        items.put("арбуз", "ягода");
        items.put("банан", "трава");
        items.put("вишня", "ягода");
        items.put("груша", "фрукт");
        items.put("дыня", "овощ");
        items.put("ежевика", "куст");
        items.put("жень-шень", "корень");
        items.put("земляника", "ягода");
        items.put("ирис", "цветок");
        items.put("картофель", "клубень");
        for (Map.Entry<String,String> entry: items.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
