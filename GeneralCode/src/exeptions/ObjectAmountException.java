package exeptions;

public class ObjectAmountException extends RuntimeException{
    public ObjectAmountException (int amount) {
        super ("Attempt to create an object with invalid amount: "+ String.valueOf(amount));
    }
}
