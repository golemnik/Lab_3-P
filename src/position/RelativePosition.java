package position;

import Props.Actor;
import Props.Entity;

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
}
