package ev2.boletin2.ej7jerarquiaempleados;

import java.util.Date;

public class Oficial extends Operario {

    private Integer lineaFabricacion;

    public Oficial(String nombre, Integer salario, Date fechaIncorporacion, String area, String nave, Integer lineaFabricacion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.lineaFabricacion = lineaFabricacion;
    }

    public Integer getLineaFabricacion() {
        return lineaFabricacion;
    }

    public void setLineaFabricacion(Integer lineaFabricacion) {
        this.lineaFabricacion = lineaFabricacion;
    }

    @Override
    public String toString() {
        return super.toString() + " Linea Fabricación: " + lineaFabricacion;
    }
}
