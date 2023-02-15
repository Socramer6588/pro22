package ev2.boletin2.ej2conversor;

public class NumConverter {
    private final Integer number;

    public NumConverter(Integer number) {
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
