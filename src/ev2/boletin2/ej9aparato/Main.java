package ev2.boletin2.ej9aparato;

public class Main {

    public static void main(String[] args) {

        Aparato[] arrayAparatos = new Aparato[3];
        arrayAparatos[0] = new Aparato();
        arrayAparatos[1] = new Frigorifico(400, 200, 'A', "Rojo", 400, 24);
        arrayAparatos[2] = new Frigorifico();

        for (Aparato a : arrayAparatos) {
            System.out.println("Del precio original: " + a.getPVP());
            a.aplicarDescuento();
            System.out.println("Tras el descuento es: " + a.getPVP());
            if (a instanceof Frigorifico){
                Frigorifico f = ((Frigorifico) a);
                f.getCapacidad();
            }
        }
    }
}
