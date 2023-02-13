package ev2.boletin2.empleados;

public abstract class Empleado {

    public final int PLUS = 300;
    private String nombre;

    private int edad;

    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n" + "Nombre = " + nombre + " Edad = " + edad + " Salario = " + salario + " PLUS = " + PLUS;
    }

    abstract void plus();
}
