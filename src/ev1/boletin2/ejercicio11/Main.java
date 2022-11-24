package ev1.boletin2.ejercicio11;

public class Main {

    static int num;
    static int cont;

    public static void findEven() {
        while (cont < 50) {
            if (num % 2 == 0) {
                System.out.println("Es par " + num);
                cont++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        findEven();
    }
}
