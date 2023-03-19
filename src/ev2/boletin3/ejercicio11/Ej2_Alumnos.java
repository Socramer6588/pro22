package ev2.boletin3.ejercicio11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Programa que almacene y gestione los Nºexpediente y alumnos de la clase.
 * Utiliza un HashMap para almacenar los datos de tus compañeros de clase.
 * a. Indica cuantos alumnos hay
 * b. Pide un Nº expediente, si existe muestra el nombre del alumno, sino indica el error
 * c. Permite eliminar un alumno de nuestra lista
 *
 * @author nccasares
 */

public class Ej2_Alumnos {
    HashMap<Integer, Alumno> alumnos = new HashMap();

    private void rellenarHashMap() {
        alumnos.put(1, new Alumno("11111A", "Maria", 20, "Vigo"));
        alumnos.put(1, new Alumno("2222222B", "Pepe", 22, "Ourense"));
        alumnos.put(3, new Alumno("33333333C", "Alvaro", 33, "Lugo"));
        alumnos.put(4, new Alumno("444444D", "Ana", 21, "Vigo"));
    }

    private void existeAlumno(int nexp) {
        if (!alumnos.containsKey(nexp)) {
            System.out.println("No existe alumno");
        } else {
            System.out.println("Alumno: " + alumnos.get(nexp));
        }
    }

    private void eliminarExpediente(int nexp) {
        if (alumnos.containsKey(nexp)) {
            alumnos.replace(nexp, new Alumno());
            alumnos.get(1).setDNI("");
            System.out.println("Alumno borrado");
        } else {
            System.out.println("No existe alumno");
        }
    }

    private void eliminarAlumno(String nombre) {
        Iterator claves = alumnos.keySet().iterator();
        Alumno al = new Alumno();

        while (claves.hasNext() && !al.getNombre().equalsIgnoreCase(nombre)) {
            Integer codigo = (Integer) claves.next();
            al = alumnos.get(codigo);
            if (al.getNombre().equals(nombre)) {
                alumnos.remove(codigo);
                System.out.println("Alumno " + nombre + " eliminado");
            }
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Ej2_Alumnos obj = new Ej2_Alumnos();
        obj.rellenarHashMap();

        System.out.println("Introduce Nº expediente:");
        obj.existeAlumno(teclado.nextInt());

        System.out.print("Introduce Nº expediente a eliminar:");
        obj.eliminarExpediente(teclado.nextInt());

        teclado = new Scanner(System.in);
        System.out.println("Eliminar alumno por nombre. Introduzca un nombre:");
        obj.eliminarAlumno(teclado.nextLine());
    }
}

class Alumno {

    private String DNI;
    private String nombre;
    private int edad;
    private String direccion;

    public Alumno(String DNI, String nombre, int edad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Alumno() {
        this.DNI = "";
        this.nombre = "";
        this.edad = -1;
        this.direccion = "";
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

}
