package exeptions;

public class ObjectAmountException extends RuntimeException{
    public ObjectAmountException () {
        super ("Attempt to create an object with invalid amount");
    }
}
