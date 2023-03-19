package ev2.boletin3.ejercicio14;

/*
*
* Modifica el ejercicio de Bebidas para incorporar una clase Almacén en la que se lleve un registro de todos los
* productos comercializados. Para dicho registro, la clase deberá contener una estructura donde las claves de los
* productos serán números enteros, y el valor será el producto comercializado.
*
* Se establecerá un tamaño máximo de Almacén por defecto a 20. No obstante, dicho valor podrá recibirse por
* constructor y asignarse de forma interna al atributo.
*
* Además, se implementarán métodos que permitan agregar un producto al registro, verificar que exista un
* producto dentro del almacén (comprobando por identificador), listar productos y eliminar un producto.
*
* Por último, en la clase ejecutable, se cambiará el array estático por uno dinámico.
*
*/

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Bebida> inventario = new ArrayList<>();
        inventario.add(new AguaMineral(1,"agua sousas","Gadis Teis",1.20,"botella de cristal","Sousas"));
        inventario.add(new AguaMineral(2,"Aguarón","Froiz Plaza E",0.75,"botella de plástico","aguarón"));
        inventario.add(new AguaMineral(3,"Agua mondariz","Mercadona Aragón",1.10,"botella de cristal","Mondariz"));
        inventario.add(new Refresco());
        inventario.add(new Refresco(4,"Kas Naranja","Lidl Teis",1.00,"lata",7.0));

        //calculoMedias(inventario);
        gestionAlmacen();
    }

    public static void gestionAlmacen() {
        Almacen a = new Almacen();
        a.agregarProducto(new AguaMineral(101, "manantial1", "zona1", 2, "botella cristal", "Bezoya"));
        a.agregarProducto(new AguaMineral(102, "manantial2", "zona3", 1, "botella plástico", "Mondariz"));
        a.agregarProducto(new Refresco(201, "Fanta", "zona1", 2, "lata", 5));
        a.agregarProducto(new Refresco(202, "Nestea", "zona3", 1.5, "lata", 8));
        a.agregarProducto(new Refresco(203, "Aquarius", "zona2", 2, "botella plástico", 9));

        a.mostrarProductos();

        a.eliminarProducto(202);

        a.mostrarProductos();
    }

    public static void calculoMedias(ArrayList<Bebida> array){
        double sumaRefrescos = 0, sumaAguas = 0;
        double contAgua = 0, contRefrescos = 0;

        for(int i=0;i<array.size();i++){

            array.get(i).calcularPrecio();

            if (array.get(i) instanceof Refresco){
                sumaRefrescos += array.get(i).getPrecio();
                contRefrescos++;
            }

            if (array.get(i) instanceof AguaMineral){
                sumaAguas += array.get(i).getPrecio();
                contAgua++;
            }

            System.out.println("El precio de " + array.get(i).getNombre() + " es: " + array.get(i).getPrecio() + " €");
        }
        System.out.println("La media de precio de los refrescos es " + sumaRefrescos/contRefrescos + " €");
        System.out.println("La media de precio del agua mineral es " + sumaAguas/contAgua + " €");
    }
}
