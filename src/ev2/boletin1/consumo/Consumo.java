package ev2.boletin1.consumo;

/*
 * Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes características:
 *  Atributos:
 * – kms. Kilómetros recorridos por el coche.
 * – litros. Litros de combustible consumido
 * – vmed. Velocidad media.
 * – pgas. Precio de la gasolina.
 *  Métodos:
 * – getTiempo. Indicará el tiempo empleado en realizar el viaje.
 * – consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
 * – consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
 * No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más apropiado para cada atributo
 */
public class Consumo {
    private final double km;
    private final double litros;
    private final double vmed;
    private final double pgas;

    public Consumo(int km, int litros, double vmed, double pgas) {
        this.km = km;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public static void main(String[] args) {
        Consumo consu = new Consumo(120, 55, 90, 1.55);
        System.out.println("tiempo del viaje :" + consu.getTiempo());
        System.out.println("consumo medio: " + consu.consumoMedio());
        System.out.println("Gasto en euros de gasolina: " + consu.consumoEuros());
    }

    public double getTiempo() {
        return km / vmed;
    }

    public double consumoMedio() {
        return litros / km * 100;
    }

    public double consumoEuros() {
        return pgas * consumoMedio();
    }
}
