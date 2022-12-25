package object;

import action.Action;
import place.Place;
import status.Status;

public interface ObjBuilder {
    ObjBuilder setObjStatus(Status status);
    ObjBuilder setObjPlace(Place place);
    ObjBuilder setObjActions(Action [] action);
    Obj build();
}
