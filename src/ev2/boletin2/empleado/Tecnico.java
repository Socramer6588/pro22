package ev2.boletin2.empleado;

import java.util.Date;

public class Tecnico extends Operario {

    private Integer seccion;

    public Tecnico(String nombre, Integer salario, Date fechaIncorporacion, String area, String nave, Integer seccion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.seccion = seccion;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+ " Sección: "+ seccion;
    }
}
