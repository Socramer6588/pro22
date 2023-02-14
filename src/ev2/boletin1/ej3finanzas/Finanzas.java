package ev2.boletin1.ej3finanzas;

/*
Realiza una clase finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros y
eurosToDolares. Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares.

La clase tiene que tener:
->Un constructor finanzas() por defecto, el cual establecerá el cambio Dólar-Euro en 1.36.
->Un constructor finanzas(double), el cual permitirá configurar el cambio dólar-euro
*/
public class Finanzas {

    private final double cambio;

    public Finanzas() {
        cambio = 1.36;
    }

    public Finanzas(double cambio) {
        this.cambio = cambio;
    }

    public double dolaresToEuros(double dolares) {
        return dolares / cambio;
    }

    public double eurosToDolares(double euros) {
        return euros * cambio;
    }
}
