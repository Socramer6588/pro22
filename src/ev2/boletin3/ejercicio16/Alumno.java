/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio16;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nuria
 */
public class Alumno extends Miembro {

    private String ciclo;
    private double notaMedia;
    private double importeMatricula;

    public Alumno(String ciclo, double notaMedia, double importeMatricula, Date fechaIncorporacion, String DNI, String nombre, int edad, String direccion) {
        super(fechaIncorporacion, DNI, nombre, edad, direccion);
        this.ciclo = ciclo;
        this.notaMedia = notaMedia;
        this.importeMatricula = importeMatricula;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    @Override
    public void aplicarBonificacion() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(super.getFechaIncorporacion());
        int anhoIncorp = calendar.get(Calendar.YEAR);
        calendar = Calendar.getInstance();
        int anhoActual = calendar.get(Calendar.YEAR);
        
        if ((anhoActual - anhoIncorp) > 2) {
            this.setImporteMatricula(importeMatricula/1.10);
        }
    }
}
