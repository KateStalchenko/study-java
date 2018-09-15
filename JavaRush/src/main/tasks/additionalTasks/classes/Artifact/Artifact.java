package main.tasks.additionalTasks.classes.Artifact;

public class Artifact {
    private int number;
    private String culture;
    private int century;

    public Artifact(int number)
    {
        this.number = number;
    }

    public Artifact(int number, String culture)
    {
        this.number = number;
        this.culture = culture;
    }

    public  Artifact(int number, String culture, int century)
    {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }


    public static void main(String[] args) {
        //напишите ваш код здесь
        Artifact item1 = new Artifact(1);
        Artifact item2 = new Artifact(2, "Russian", 18 );
        Artifact item3 = new Artifact(3, "French");
        Artifact item4 = new Artifact(2, "German", 5);
    }
}
