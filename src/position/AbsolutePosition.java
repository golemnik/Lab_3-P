package position;

public class AbsolutePosition implements Position{
    private String position;

    public AbsolutePosition () {this.position = "где-то";}
    public AbsolutePosition (String position) {this.position = position;}

    public void updatePosition (String newPosition) {this.position = newPosition;}

    @Override
    public String place() {
        return position;
    }
}
