package ev2.boletin2.conversor;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter(20);
        System.out.println(converter.getNumber('B'));
        System.out.println(converter.getNumber('H'));
        System.out.println(converter.getNumber('O'));
        System.out.println(converter.getNumber((char) 66));
        System.out.println(converter.getNumber((char) 72));
        System.out.println(converter.getNumber((char) 79));
        System.out.println(converter.getNumber((char) 100));
    }
}
