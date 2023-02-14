package ev2.boletin1.ejercicio2;

public class AvionTurbina extends Aeronave {
    private int numTurbinas;
    private int numMotores;

    public AvionTurbina(String id, int numPasajeros, int autonomiaMaxima, String modelo, int numTurbinas, int numMotores) {
        super(id, numPasajeros, autonomiaMaxima, modelo);
        this.numTurbinas = numTurbinas;
        this.numMotores = numMotores;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
}
