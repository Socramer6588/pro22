package ev2.boletin2.ej5ultimacifra;

public class LastDigit {

    private final String number;

    public LastDigit(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getNumber(String param) {
        if (param.equals("last")) {
            return number.substring(number.length() - 1);
        } else {
            return "Error";
        }
    }
}