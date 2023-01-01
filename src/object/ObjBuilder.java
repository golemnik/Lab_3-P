package object;

import action.Action;
import exeptions.ComplexityExeption;
import place.Place;
import status.Stats;

public interface ObjBuilder {
    ObjBuilder setObjStatus(Stats status);
    ObjBuilder setObjPlace(Place place);
    ObjBuilder setObjActions(Action [] action);
    Obj build() throws ComplexityExeption;
    Obj defaultBuild ();
}
