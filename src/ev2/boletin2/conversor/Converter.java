package ev2.boletin2.conversor;

public class Converter {
    private final Integer number;

    public Converter(Integer number) {
        this.number = number;
    }

    public String getNumber(char format) {
        if (format == 66 || format == 72 || format == 79) {
            if (format == 'B') {
                return Integer.toBinaryString(number);
            } else if (format == 'H') {
                return Integer.toHexString(number);
            } else if (format == 'O') {
                return Integer.toOctalString(number);
            }
        }
        return "manco";
    }
}
