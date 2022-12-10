package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.other.Status;

public class SimpleObjectBuilder implements ObjBuilder {
    private SimpleObject obj;

    @Override
    public void reset () {
        obj = new SimpleObject();
    }
    @Override
    public void setObjName(String [] name) {
        obj.setNames(name);
    }
    @Override
    public void setObjPlace(Place [] place){
        obj.setPlaces(place);
    }
    @Override
    public void setObjActions(Action [] action){
        obj.setActions(action);
    }
    @Override
    public void setObjStatus(Status [] status){
        obj.setStatus(status);
    }

    public SimpleObject getObj() {
        return this.obj;
    }
}
