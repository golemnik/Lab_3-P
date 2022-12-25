package newStruct.object;

import newStruct.action.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public interface ObjBuilder {
    ObjBuilder setObjStatus(Status status);
    ObjBuilder setObjPlace(Place place);
    ObjBuilder setObjActions(Action [] action);
    Obj build();
}
