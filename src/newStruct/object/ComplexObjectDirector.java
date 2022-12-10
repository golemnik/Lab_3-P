package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.other.Status;

public class ComplexObjectDirector {
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects) {
        builder.reset();
        builder.setObjParts(objects);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action[] actions) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Place[] places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Status[] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Action [] actions) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjActions(actions);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Place [] places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Action [] actions, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Action [] actions, Place [] places) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Action [] actions, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
    public void createObj (ComplexObjBuilder builder, SimpleObject [] objects, String [] names, Action [] actions, Place [] places, Status [] statuses) {
        builder.reset();
        builder.setObjParts(objects);
        builder.setObjName(names);
        builder.setObjActions(actions);
        builder.setObjPlace(places);
        builder.setObjStatus(statuses);
    }
}
