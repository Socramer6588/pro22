package ev2.boletin3.ejercicio15;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * Implementar una subclase Lavadora con las siguientes características:
 *
 * Sus atributos son kilos y secadora integrada (booleano). Por defecto, la capacidad será de 7 kilos y secadora será false.
 * * Un constructor por defecto.
 * * Un constructor con el precio y peso. El resto por defecto.
 * * Un constructor con la capacidad, secadora y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 * * Getters y Setters
 * * aplicarDescuento(): si tiene una capacidad superior a 9 kilos, se incrementará el precio un 30% y si no tiene secadora integrada, se descontarán 120 €.
 *
 * Ahora crea una clase ejecutable que realice lo siguiente:
 *
 * Crea un array de Electrodomesticos de 5 posiciones.
 * Ejecutar el método aplicarDescuento() para cada uno de los elementos.
 * Deberás mostrar el precio de cada tipo de aparato (instanceof)
 *
 * */
public class Principal2 {

    LinkedList<Aparato> cola = new LinkedList<>();

    public void agregar(Aparato aparato){
        if(!verificarSiExiste(aparato))
            cola.add(aparato);
    }

    public void eliminar(Aparato aparato){
        if(!verificarSiExiste(aparato)){
            System.out.println("No existe el aparato introducido");
        }else{
            cola.remove(aparato);
        }
    }

    public Aparato extraer(){
        return cola.remove();
    }

    public boolean verificarSiExiste(Aparato aparato){
        return cola.contains(aparato);
    }

    public void listar(){
        Iterator<Aparato> iterador = cola.iterator();

        while(iterador.hasNext()){
            Aparato ap = iterador.next();
            System.out.println(ap.toString());
        }
    }

    private void aplicarDescuentos() {
        double sumaTotal = 0;
        double sumaFrigos = 0;
        double sumaLavadoras = 0;

        for (Aparato a: cola) {

            if (a instanceof Aparato) {
                sumaTotal += a.aplicarDescuento();
                /*a.aplicarDescuento();
                sumaTotal += a.getPVP();*/
            }
            if (a instanceof Lavadora) {
                sumaLavadoras += a.aplicarDescuento();
            }
            if (a instanceof Frigorifico) {
                sumaFrigos += a.aplicarDescuento();
            }
        }

        System.out.println("La suma total es " + sumaTotal);
        System.out.println("La suma de las lavadoras es " + sumaLavadoras);
        System.out.println("La suma de los frigoríficos es " + sumaFrigos);
    }

    public static void main(String[] args) {
        Principal2 obj = new Principal2();

        obj.agregar(new Frigorifico(200, 60));
        obj.agregar(new Lavadora(500, 30));
        obj.agregar(new Frigorifico(500, 80, 'E', "negro", 420, 165));
        obj.agregar(new Lavadora(600, 25, 'B', "blanco", 9, true));
        obj.agregar(new Aparato(600, 20, 'D', "gris"));

        System.out.println("CONTENIDO:");
        obj.listar();
        System.out.println("EXTRAER ELEMENTO EN COLA");
        System.out.println(obj.cola.peek().toString());
        System.out.println(obj.extraer());
        System.out.println("CONTENIDO DESPUÉS DE ELIMINAR:");
        obj.listar();

        obj.aplicarDescuentos();
    }
}
