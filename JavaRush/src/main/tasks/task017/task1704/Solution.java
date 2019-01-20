package main.tasks.task017.task1704;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();

        public synchronized void addFruit(int index, String fruit) {
            fruits.add(index, fruit);
        }

        public synchronized void removeFruit(int index) {
            fruits.remove(index);
        }

        public synchronized void addVegetables(int index, String vegetable) {
            vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable(int index) {
            vegetables.remove(index);
        }
    }
}
