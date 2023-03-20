/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio16;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nuria
 */
public class Profesor extends Miembro{
    private String tipoJornada;
    private double sueldo;
    private Especialidad especialidad;

    public Profesor(String tipoJornada, double sueldo, Especialidad especialidad, Date fechaIncorporacion, String DNI, String nombre, int edad, String direccion) {
        super(fechaIncorporacion, DNI, nombre, edad, direccion);
        this.tipoJornada = tipoJornada;
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public void aplicarBonificacion() {
        Calendar calendar = Calendar.getInstance();
        int anhoActual = calendar.get(Calendar.YEAR);
        calendar.setTime(super.getFechaIncorporacion());
        int anhoIncorp = calendar.get(Calendar.YEAR);
        
        if ((anhoActual - anhoIncorp) > 3) {
            this.setSueldo(sueldo*1.15);
        }
    }
}
