package exeptions;

public class TargetException extends RuntimeException{
    public TargetException() {
        super("Attempt to create target action with no target");
    }
}
