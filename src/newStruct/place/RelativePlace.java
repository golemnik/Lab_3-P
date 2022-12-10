package newStruct.place;

import newStruct.object.AbstractObject;

public class RelativePlace extends AbstractPlace implements Place{
    AbstractObject object;

    public RelativePlace (String place, AbstractObject object) {
        this.setName(place);
        this.object = object;
    }
    @Override
    public String loc() {
        return getName() + " " + object.getFullName();
    }

}
