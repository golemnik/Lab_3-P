package newStruct.update;

import newStruct.object.AbstractObject;
import newStruct.place.AbstractPlace;

public class PlaceUpdateBuilder implements UpdateBuilder{
    private AbstractObject obj;

    @Override
    public void reset(AbstractObject obj) {
        this.obj = obj;
    }
}
