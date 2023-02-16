package ev2.boletin2.ej6pez;

public class Shark extends Fish {

    private Integer teeth;

    public Shark(String name, Integer teeth) {
        super(name);
        this.teeth = teeth;
    }

    public Integer getTeeth() {
        return teeth;
    }

    public void setTeeth(Integer teeth) {
        this.teeth = teeth;
    }
}
