package newStruct.object;


import newStruct.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public class ComplexObjectBuilder implements ComplexObjBuilder {
    private ComplexObject obj;

    @Override
    public void reset () {
        obj = new ComplexObject();
    }
    @Override
    public void setObjName(String [] name) {
        obj.setNames(name);
    }
    @Override
    public void setObjPlace(Place[] place){
        obj.setPlaces(place);
    }
    @Override
    public void setObjActions(Action[] action){
        obj.setActions(action);
    }
    @Override
    public void setObjStatus(Status[] status){
        obj.setStatus(status);
    }

    @Override
    public void setObjParts (SimpleObject[] parts) {
        obj.setParts(parts);
    }

    public ComplexObject getObj() {
        return this.obj;
    }
}
