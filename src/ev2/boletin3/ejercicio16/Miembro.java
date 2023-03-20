/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio16;

import java.util.Date;

/**
 *
 * @author nuria
 */
public abstract class Miembro extends Persona{
    private Date fechaIncorporacion;

    public Miembro(Date fechaIncorporacion, String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public abstract void aplicarBonificacion();
}
