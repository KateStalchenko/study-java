package main.tasks.task006.task0604;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            double massIndex = weight / (height * height);
            if (massIndex < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (massIndex >= 18.5 && massIndex <= 24.9) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if (massIndex >= 25 && massIndex <= 29.9) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
