package oldStruct.position;

import oldStruct.props.Actor;
import oldStruct.props.Entity;

import java.util.Objects;

public class RelativePosition implements Position {
    Entity relativeObject;
    String relativeType;

    {
        relativeType = "около";
    }

    public RelativePosition () {
        this.relativeObject = new Actor();
    }
    public RelativePosition (Entity relativeObject) {
        this.relativeObject = relativeObject;
    }
    public RelativePosition (Entity relativeObject, String relativeType) {
        this.relativeObject = relativeObject;
        this.relativeType = relativeType;
    }
    void updateObject (Entity newObject) {this.relativeObject = newObject;}

    @Override
    public String place (){
        return relativeType + " " + relativeObject.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(relativeObject, relativeType);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelativePosition that)) return false;
        return Objects.equals(relativeObject, that.relativeObject) && Objects.equals(relativeType, that.relativeType);
    }

    @Override
    public String toString() {
        return "RelativePosition{" +
                "relativeObject=" + relativeObject +
                ", relativeType='" + relativeType + '\'' +
                '}';
    }
}
