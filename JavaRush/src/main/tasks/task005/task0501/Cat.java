package main.tasks.task005;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public Cat() {
    }

    boolean fight(Cat anotherCat) {
        int cat1Result = 0;
        int cat2Result = 0;
        if (this.weight > anotherCat.weight) {
            cat1Result++;
        } else {
            cat2Result++;
        }

        if (this.age > anotherCat.age) {
            cat1Result++;
        } else {
            cat2Result++;
        }

        if (this.strength > anotherCat.strength) {
            cat1Result++;
        } else {
            cat2Result++;
        }
        return cat1Result > cat2Result;
    }
}

