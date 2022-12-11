package newStruct.object;

import newStruct.action.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public abstract class AbstractObject {
    public abstract void setStatus (Status[] status);
    public abstract void setPlaces (Place[] place);
    public abstract void setActions (Action[] action);

    public abstract String getFullPlace ();
    public abstract String getFullAction ();
    public abstract String getFullStatus ();
}
