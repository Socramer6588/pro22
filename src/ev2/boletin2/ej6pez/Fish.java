package ev2.boletin2.ej6pez;

public class Fish {
    private static int fishNumber;
    private String name;

    public Fish(String name) {
        fishNumber++;
        this.name = name;
    }

    public static int getFishNumber() {
        return fishNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
