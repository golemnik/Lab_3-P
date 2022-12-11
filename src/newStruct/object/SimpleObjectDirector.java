package newStruct.object;

import newStruct.action.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public class SimpleObjectDirector {
    public void createObj (ObjBuilder builder) {
        builder.reset();
    }
    public void createObj (ObjBuilder builder, Action [] actions) {
        builder.reset();
        builder.setObjActions(actions);
    }
    public void createObj (ObjBuilder builder, Place [] places) {
        builder.reset();
        builder.setObjPlace(places);
    }
    public void createObj (ObjBuilder builder, Status [] statuses) {
        builder.reset();
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ObjBuilder builder, Status [] statuses, Action [] actions) {
        builder.reset();
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, Status [] statuses, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjActions(actions);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
}
