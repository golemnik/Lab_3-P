package newStruct.object;

import newStruct.action.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public interface ObjBuilder {
    public void reset();
    public void setObjStatus(Status status);
    public void setObjPlace(Place place);
    public void setObjActions(Action [] action);

}
