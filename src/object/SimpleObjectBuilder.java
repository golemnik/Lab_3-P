package object;

import action.Action;
import action.UnknownAction;
import place.Place;
import place.UnknownPlace;
import status.Stats;
import status.UnknownStats;

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
    public SimpleObjectBuilder setObjStatus(Stats status){
        obj.setStatus(status);
        return this;
    }
    @Override
    public SimpleObject build() {
        return obj;
    }
    @Override
    public SimpleObject defaultBuild () {
        obj.setStatus(new UnknownStats());
        obj.setPlaces(new UnknownPlace());
        obj.setActions(new Action[]{new UnknownAction()});
        return obj;
    };
}
