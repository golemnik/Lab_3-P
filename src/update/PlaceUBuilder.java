package update;

import object.AbstractObject;

public class PlaceUBuilder implements PlaceUpdateBuilder {
    private AbstractObject obj;

    @Override
    public void update() {

    }

    @Override
    public void reset(AbstractObject obj) {
        this.obj = obj;
    }
}
