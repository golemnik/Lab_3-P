package newStruct.object;

import newStruct.Action;
import newStruct.other.Place;
import newStruct.other.Status;

public class SimpleObjectDirector {
    public void createObj (ObjBuilder builder) {
        builder.reset();
    }
    public void createObj (ObjBuilder builder, String [] names) {
        builder.reset();
        builder.setObjName(names);
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
    public void createObj (ObjBuilder builder, String [] names, Action [] actions) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjActions(actions);
    }
    public void createObj (ObjBuilder builder, String [] names, Place [] places) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjPlace(places);
    }
    public void createObj (ObjBuilder builder, String [] names, Status [] statuses) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ObjBuilder builder, Action [] actions, Status [] statuses) {
        builder.reset();
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, String [] names, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ObjBuilder builder, String [] names, Action [] actions, Status [] statuses) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, String [] names, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ObjBuilder builder, String [] names, Action [] actions, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
}
