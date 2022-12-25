package object;


import action.Action;
import place.Place;
import status.Status;

public class ComplexObjectBuilder implements ComplexObjBuilder {
    private final ComplexObject obj;
    public ComplexObjectBuilder () {
        this.obj = new ComplexObject();
    }
    @Override
    public ComplexObjectBuilder setObjStatus(Status status){
        obj.setStatus(status);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjPlace(Place place){
        obj.setPlaces(place);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjActions(Action[] action){
        obj.setActions(action);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjParts (SimpleObject[] parts) {
        obj.setParts(parts);
        return this;
    }
    @Override
    public ComplexObject build() {
        return obj;
    }
}
