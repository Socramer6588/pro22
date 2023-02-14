package ev2.boletin2.ej1viajero;

public class Probador {

    final static String FormatoNormal = "normal";
    final static String FormatoPausado = "pausado";

    public static void main(String[] args) {

        Viajero v = new Viajero();
        Viajero v2 = new Viajero("22222222A", "Pepa", "Pereira", "ESP", "");

        System.out.println("Número de instancias creadas: " + Viajero.getContador());
        v.getInfo(FormatoNormal);
        v2.getInfo2();
    }
}
