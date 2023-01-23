package ev2.boletin2.empleado;

import java.util.Date;

public class Empleado {

    private String nombre;

    private Integer salario;

    private Date fechaIncorporacion;

    public Empleado(String nombre, Integer salario, Date fechaIncorporacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Salario: " + salario + " Fecha Incorporación: " + fechaIncorporacion;
    }
}
