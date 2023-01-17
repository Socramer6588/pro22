package ev2.boletin2.ultimacifra;

public class LastDigit { // TODO: 17/01/2023 rehacer esta mierda!

    private static String number = "";

    public LastDigit(String number) {
        LastDigit.number = number;
    }

    public static String getNumber() {
        return number;
    }

    public static String getNumber(String param) {
        if (param.equals("last")) {

            return number.substring(number.length() - 1);
        } else {

            return "Error";
        }
    }

    public static void main(String[] args) {

        LastDigit ld = new LastDigit("12084");
        System.out.println(LastDigit.getNumber("last"));

    }
}