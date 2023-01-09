package exeptions;

public class PlacementException extends RuntimeException{
    public PlacementException() {
        super("Attempt to create placemented action with no placement");
    }
}
