package object;

import action.Action;
import action.UnknownAction;
import place.ObjectPlace;
import place.Place;
import status.GeneralStats;
import status.Stats;

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
        obj.setStatus(new GeneralStats().builder().defualtBuild());
        obj.setPlaces(new ObjectPlace().builder().defualtBuild());
        obj.setActions(new Action[]{new UnknownAction()});
        return obj;
    };
}
