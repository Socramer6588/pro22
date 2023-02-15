package ev2.boletin2.ej2conversor;

public class Main {
    public static void main(String[] args) {
        NumConverter c1 = new NumConverter(20);
        System.out.println(c1.getNumber('B'));
        System.out.println(c1.getNumber((char) 66));
        System.out.println(c1.getNumber('H'));
        System.out.println(c1.getNumber((char) 72));
        System.out.println(c1.getNumber('O'));
        System.out.println(c1.getNumber((char) 79));
        System.out.println(c1.getNumber());
        System.out.println(c1.getNumber('F'));
    }
}

