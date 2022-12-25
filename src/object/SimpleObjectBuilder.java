package object;

import action.Action;
import place.Place;
import status.Status;

public class SimpleObjectBuilder implements ObjBuilder {
    private final SimpleObject obj;

    public SimpleObjectBuilder() {
        this.obj = new SimpleObject();
    }

    @Override
    public SimpleObjectBuilder setObjPlace(Place place){
        obj.setPlaces(place);
        return this;
    }
    @Override
    public SimpleObjectBuilder setObjActions(Action [] action){
        obj.setActions(action);
        return this;
    }
    @Override
    public SimpleObjectBuilder setObjStatus(Status status){
        obj.setStatus(status);
        return this;
    }

    @Override
    public SimpleObject build() {
        return obj;
    }

    public SimpleObject getObj() {
        return this.obj;
    }
}
