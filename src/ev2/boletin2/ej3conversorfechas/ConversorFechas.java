package ev2.boletin2.ej3conversorfechas;

/*
 * Realiza una clase ConversorFechas que tenga los siguientes métodos:
 *
 * * String normalToAmericano(String). Este método convierte una fecha en formato normal dd/mm/yyyy a
 * formato americano mm/dd/yyyy.
 *
 * * String americanoToNormal(String). Este método realiza el paso contrario, convierte fechas en formato
 * americano a formato normal.
 * */

public class ConversorFechas {
    public static void main(String[] args) {
        ConversorFechas s = new ConversorFechas();
        System.out.println(s.normalToAmericano("16/08/1973"));
        System.out.println(s.americanoToNormal("08/16/1973"));
    }

    public String normalToAmericano(String s) {
        if (s.charAt(2) == '/' && s.charAt(5) == '/' && s.length() == 10)
            return s.substring(3, 6) + s.substring(0, 3) + s.substring(6);
        else return "Formato de fecha no válido";
    }

    public String americanoToNormal(String s) {
        if (s.charAt(2) == '/' && s.charAt(5) == '/' && s.length() == 10)
            return s.substring(3, 6) + s.substring(0, 3) + s.substring(6);
        else return "Formato de fecha no válido";
    }
}
