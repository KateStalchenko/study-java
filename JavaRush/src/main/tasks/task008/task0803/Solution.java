package main.tasks.task008.task0803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        System.out.println("Time for insert 10000 in ArrayList " + getTimeMsOfInsert(arrayList) + "ms");

        // LinkedList
        LinkedList linkedList = new LinkedList();
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        System.out.println("Time for insert 10000 in LinkedList " + getTimeMsOfInsert(linkedList) + "ms");
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i, i + 5);
        }

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i, i + 20);
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код
        long startTime = System.nanoTime();
        insert10000(list);
        //напишите тут ваш код
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
