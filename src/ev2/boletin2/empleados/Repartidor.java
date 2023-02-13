package ev2.boletin2.empleados;

public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Zona = " + zona;
    }
}
