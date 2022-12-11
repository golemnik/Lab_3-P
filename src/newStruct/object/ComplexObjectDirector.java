package newStruct.object;

import newStruct.action.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public class ComplexObjectDirector {
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects) {
        builder.reset();
        builder.setObjParts(objects);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action[] actions) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Place places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Status statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action [] actions, Place places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action [] actions, Status statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Place  places, Status statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action [] actions, Place places, Status statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
}
