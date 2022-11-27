package position;

import Props.Actor;
import Props.Entity;

public class RelativePosition implements Position {
    Entity relativeObject;

    public RelativePosition () {
        this.relativeObject = new Actor();
    }

    public RelativePosition (Entity relativeObject) {
        this.relativeObject = relativeObject;
    }

    void updateObject (Entity newObject) {this.relativeObject = newObject;}

    @Override
    public String place (){
        return "около " + relativeObject.getName();
    }
}
