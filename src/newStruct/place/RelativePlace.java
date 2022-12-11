package newStruct.place;

import newStruct.object.AbstractObject;

public class RelativePlace extends AbstractPlace implements Place{
    AbstractObject object;

    public RelativePlace (String place, AbstractObject object) {
        this.setPlace(place);
        this.object = object;
    }
    @Override
    public String loc() {
        return getPlace() + " " + object.getFullStatus();
    }

}
