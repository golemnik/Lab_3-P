package newStruct;

import newStruct.other.Action;
import newStruct.other.Place;
import newStruct.other.Status;

public interface ObjBuilder {
    public void reset();
    public void setObjName(String[] name);
    public void setObjPlace(Place [] place);
    public void setObjActions(Action [] action);
    public void setObjStatus(Status [] status);

}
