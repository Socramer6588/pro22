package ev2.boletin2.ej1viajero;

import java.util.Scanner;

public class Viajero {

    private static int contador;
    private String DNI;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;

    public Viajero() {
        contador++;
        this.DNI = "00000A";
        this.nombre = "nombre";
        this.apellidos = "apellidos";
        this.nacionalidad = "nacionalidad";
        this.direccion = "direccion";
    }

    public Viajero(String DNI, String nombre, String apellidos, String nacionalidad, String direccion) {
        contador++;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
    }

    public static int getContador() {
        return contador;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void getInfo(String Formato) {
        Scanner sc = new Scanner(System.in);
        if (Formato.equals("pausado")) {
            String intro;
            System.out.println("Pulse intro para obtener más info");
            int cont = 0;
            do {
                intro = sc.nextLine();
                cont++;
                switch (cont) {
                    case 1:
                        System.out.println(getDNI());
                        break;
                    case 2:
                        System.out.println(getNombre());
                        break;
                    case 3:
                        System.out.println(getApellidos());
                        break;
                    case 4:
                        System.out.println(getNacionalidad());
                        break;
                    case 5:
                        System.out.println(getDireccion());
                        break;
                }
            } while (intro.equals("") && cont <= 5);
        } else if (Formato.equals("normal")) {
            System.out.println(getDNI());
            System.out.println(getNombre());
            System.out.println(getApellidos());
            System.out.println(getNacionalidad());
            System.out.println(getDireccion());
        }
    }

    public void getInfo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce p para pausado n para formato normal");
        String d = sc.nextLine();
        switch (d) {
            case "p":
                System.out.println(getDNI());
                sc.nextLine();
                System.out.println(getNombre());
                sc.nextLine();
                System.out.println(getApellidos());
                sc.nextLine();
                System.out.println(getNacionalidad());
                sc.nextLine();
                System.out.println(getDireccion());
                sc.nextLine();
                System.out.println(getContador());
                break;
            case "n":
                System.out.println(getDNI());
                System.out.println(getNombre());
                System.out.println(getApellidos());
                System.out.println(getNacionalidad());
                System.out.println(getDireccion());
                System.out.println(getContador());
                break;
        }
    }
}
