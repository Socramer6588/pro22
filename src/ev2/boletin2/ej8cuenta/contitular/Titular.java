package ev2.boletin2.ej8cuenta.contitular;


/*
 * Vamos a crear una clase Titular. Sus atributos son: nombre, edad y DNI. Construye los siguientes
 * métodos para la clase:
 *
 * Un constructor, donde los datos pueden estar vacíos.
 * Los setters y getters para cada uno de los atributos.
 * mostrar(): Muestra los datos de la persona.
 * esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
 *
 * A continuación, sustituye en la clase Cuenta y CuentaJoven todas las referencias al titular,
 * para que, en vez de gestionar sus datos a través de atributos, lo realice mediante un objeto de tipo Titular.
 *
 * */


public class Titular {
    private String nombre;
    private int edad;
    private String DNI;

    public Titular() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
    }

    public Titular(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String mostrar() {
        return "Nombre: " + this.nombre + ". Edad: " + this.edad + ". DNI: " + this.DNI;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}