package ev2.boletin2.conversor;

public class Converter {
    private final Integer number;

    public Converter(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getNumber(char format) {
        return switch (format) {
            case 'B' -> Integer.toBinaryString(number);
            case 'H' -> Integer.toHexString(number);
            case 'O' -> Integer.toOctalString(number);
            default -> "Error";
        };
    }
}
