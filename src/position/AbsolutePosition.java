package position;

import java.util.Objects;

public class AbsolutePosition implements Position{
    private String position;

    public AbsolutePosition () {this.position = "где-то";}
    public AbsolutePosition (String position) {this.position = position;}

    public void updatePosition (String newPosition) {this.position = newPosition;}

    @Override
    public String place() {
        return position;
    }
    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbsolutePosition that)) return false;
        return Objects.equals(position, that.position);
    }

    @Override
    public String toString() {
        return "AbsolutePosition{" +
                "position='" + position + '\'' +
                '}';
    }
}
