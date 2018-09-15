package main.tasks.task003.task0307;

public class solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Lilo";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Liko";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Dilo";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Lolo";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Milo";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Male";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Dale";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Kale";

        Terran terran1 = new Terran();
        terran1.name = "Paulo";
        Terran terran2 = new Terran();
        terran2.name = "Dolli";
        Terran terran3 = new Terran();
        terran3.name = "Krone";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
