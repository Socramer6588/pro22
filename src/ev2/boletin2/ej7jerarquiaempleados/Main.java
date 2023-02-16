package ev2.boletin2.ej7jerarquiaempleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static Empleado[] arrayEmp = new Empleado[7];

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        try {
            Date d = sdf.parse("01/01/2000");
            arrayEmp[0] = new Empleado("Rafa", 2000, d);
            arrayEmp[1] = new Tecnico("Héctor", 2000, sdf.parse("01/01/2000"), "Pedidos", "A1", 18);
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println(arrayEmp[0].toString());
        System.out.println(arrayEmp[1]);
    }
}
