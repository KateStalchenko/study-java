package main.tasks.task008.task0806;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("ALL")
public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталин", new Date("JUNE 1 1980"));
        map.put("Батистута", new Date("JUNE 1 1980"));
        map.put("Матиз", new Date("SEPTEMBER 1 1980"));
        map.put("Борис", new Date("FEBRUARY 1 1980"));
        map.put("Новел", new Date("MARCH 1 1980"));
        map.put("Виолла", new Date("MAY 1 1980"));
        map.put("Шокин", new Date("MAY 1 1980"));
        map.put("Феликс", new Date("JUNE 1 1980"));
        map.put("Эдмунд", new Date("JUNE 1 1980"));

        return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        } //Напишите тут ваш код

    }
    public static void main(String[] args)
    {
        HashMap<String, Date> wasBorn = createMap();
        for(Map.Entry<String, Date> pair : wasBorn.entrySet()){
            String name = pair.getKey();
            Date chislo = pair.getValue();
            System.out.println( name + ":" + chislo);

        }
        System.out.println("*************");
        removeAllSummerPeople(wasBorn);
        for(Map.Entry<String, Date> pair : wasBorn.entrySet()){
            String name = pair.getKey();
            Date chislo = pair.getValue();
            System.out.println( name + ":" + chislo);
        }}
}