package ev2.boletin2.conversornumero;

public class Main {
    public static void main(String[] args) {
        NumConverter converter = new NumConverter(20);
        System.out.println(converter.getNumber('B'));
        System.out.println(converter.getNumber((char) 66));
        System.out.println(converter.getNumber('H'));
        System.out.println(converter.getNumber((char) 72));
        System.out.println(converter.getNumber('O'));
        System.out.println(converter.getNumber((char) 79));
        System.out.println(converter.getNumber());
        System.out.println(converter.getNumber('F'));
    }
}

