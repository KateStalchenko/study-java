package main.tasks.task008.task0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> mapSalary = new HashMap<>();
        mapSalary.put("Jonhs", 2000);
        mapSalary.put("Smith", 740);
        mapSalary.put("Orelly", 1500);
        mapSalary.put("Collins", 320);
        mapSalary.put("Kraft", 960);
        mapSalary.put("Sohor", 8520);
        mapSalary.put("Drims", 200);
        mapSalary.put("Gregory", 800);
        mapSalary.put("Jilly", 340);
        mapSalary.put("James", 1200);
        return mapSalary;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            int salary = it.next().getValue();
            if (salary<500){
                it.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> mapSalary = createMap();
        removeItemFromMap(mapSalary);
    }
}