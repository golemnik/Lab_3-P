package exeptions;

public class ComplexityException extends RuntimeException {
    public ComplexityException() {
        super("Attempt to create complex object with zero complexity");
    }
}
