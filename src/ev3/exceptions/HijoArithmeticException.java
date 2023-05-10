package ev3.exceptions;

public class HijoArithmeticException extends ArithmeticException{

    public HijoArithmeticException(){}

    public HijoArithmeticException(String s){
        super(s);
        System.out.println("Error HijoArithmeticException");
    }
}
