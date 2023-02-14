package ev2.boletin1.ejercicio2;

public abstract class Aeronave {
    private String id;
    private int numPasajeros;
    private int autonomiaMaxima;
    private String modelo;

    public Aeronave(String id, int numPasajeros,int autonomiaMaxima,String modelo){
        this.id = id;
        this.numPasajeros = numPasajeros;
        this.autonomiaMaxima = autonomiaMaxima;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public void setAutonomiaMaxima(int autonomiaMaxima) {
        this.autonomiaMaxima = autonomiaMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}