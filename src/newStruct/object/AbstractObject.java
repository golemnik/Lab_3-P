package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.other.Status;

public abstract class AbstractObject {
    public abstract void setNames (String [] name);
    public abstract void setPlaces (Place[] place);
    public abstract void setActions (Action[] action);
    public abstract void setStatus (Status[] status);
    public abstract String text ();
}
