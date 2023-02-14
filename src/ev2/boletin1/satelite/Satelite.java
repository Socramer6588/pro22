package ev2.boletin1.satelite;

/*
 * Clase satélite, añádele los siguientes métodos:
 * Método void variaAltura(double desplazamiento): Este método acepta un parámetro que será positivo o
 * negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
 * Método boolean enOrbita(): Este método devolverá false si el satélite está en tierra, y true en caso contrario.
 * Método void variaPosicion(double variap, double variam): Este método permite modificar los atributos de
 * posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
 * positivos o negativos relativos que harán al satélite modificar su posición.
 *
 * */

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    Satelite(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    Satelite() {
        meridiano = paralelo = distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo" + paralelo + "Meridiano" + meridiano + "a una distancia de la tierra de" + distancia_tierra + "Kilómetros");
    }

    public void variaAltura(double desplazamiento) {
        distancia_tierra += desplazamiento;
    }

    boolean enOrbita() {
        return distancia_tierra > 0;
    }

    void variaPosicion(double variap, double variam) {
        meridiano += variam;
        paralelo += variap;
    }
}
