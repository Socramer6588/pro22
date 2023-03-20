/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni, nombre, direccion, ciclo, tipoJornada;
        int edad, idEsp;
        double notaMedia, importeMat, sueldo;
        Date fechaInc;
        ArrayList<Miembro> miembros = new ArrayList<>();
        ArrayList<Especialidad> esp = new ArrayList<>();
        esp.add(new Especialidad(0, "Informática"));
        esp.add(new Especialidad(1, "Sanidad"));

        for (int i = 0; i < 5; i++) {
            boolean datosValidos = true;
            if (i % 2 == 0) {
                do {
                    try {
                        System.out.println("Introduzca nombre, Dni, edad, direccion");
                        nombre = sc.nextLine();
                        dni = sc.nextLine();
                        edad = sc.nextInt();
                        direccion = sc.nextLine();

                        System.out.println("Introduzca ahora ciclo, nota media, importe de matrícula");
                        ciclo = sc.nextLine();
                        notaMedia = sc.nextDouble();
                        importeMat = sc.nextDouble();

                        System.out.println("Introduzca fecha de matriculacion");
                        fechaInc = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                        datosValidos = true;
                        miembros.add(new Alumno(ciclo, notaMedia, importeMat, fechaInc, dni, nombre, edad, direccion));
                    } catch (ParseException | InputMismatchException e) {
                        datosValidos = false;
                        System.out.println("ERROR: Los datos introducidos no son correctos");
                    }
                } while (!datosValidos);
            } else {
                do {
                    try {
                        System.out.println("Introduzca nombre, Dni, edad, direccion");
                        nombre = sc.nextLine();
                        dni = sc.nextLine();
                        edad = sc.nextInt();
                        direccion = sc.nextLine();

                        System.out.println("Introduzca ahora tipo de jornada y sueldo");
                        tipoJornada = sc.nextLine();
                        sueldo = sc.nextDouble();

                        System.out.println("Las especialidades disponibles son:");
                        System.out.println(esp.toString());

                        System.out.println("Introduzca ahora el identificador de la especialidad");
                        idEsp = sc.nextInt();

                        System.out.println("Introduzca fecha de incorporación al centro");
                        fechaInc = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                        datosValidos = true;
                        miembros.add(new Profesor(tipoJornada, sueldo, esp.get(idEsp), fechaInc, dni, nombre, edad, direccion));
                    } catch (ParseException | InputMismatchException e) {
                        datosValidos = false;
                        System.out.println("ERROR: Los datos introducidos no son correctos");
                    }
                } while (!datosValidos);
            }
        }

        int sumaEdad = 0;
        int sumaSueldos = 0;
        int contProfesores = 0;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i) instanceof Profesor) {
                sumaEdad += ((Profesor) miembros.get(i)).getEdad();
                sumaSueldos += ((Profesor) miembros.get(i)).getSueldo();
                contProfesores++;
            }
        }
        System.out.println("La edad media de los profesores es: " + sumaEdad/contProfesores);
        System.out.println("El sueldo medio de los profesores es: " + sumaSueldos/contProfesores);
        
        double sumaNotas = 0;
        int contAlumnos = 0;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i) instanceof Alumno && ((Alumno) miembros.get(i)).getCiclo().equals("DAM")) {
                sumaNotas += ((Alumno) miembros.get(i)).getNotaMedia();
                contAlumnos++;
            }
        }
        System.out.println("La nota media de los alumnos de DAM es: " + sumaNotas/contAlumnos);
    }
}
