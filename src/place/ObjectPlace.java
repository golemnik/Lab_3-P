package place;

import object.AbstractObject;

public class ObjectPlace extends AbstractPlace implements Place{

    AbstractObject object;
    public ObjectPlace () {
    }
    private void setRelativeObject (AbstractObject relativeObject) {
        object = relativeObject;
    }

    @Override
    public String text() {
        return getText();
    }

    public PlaceComponents builder () {
        return new PlaceComponents();
    }

    public static class PlaceComponents {
        ObjectPlace place;

        public PlaceComponents () {
            place = new ObjectPlace();
        }
        public PlaceComponents addPlaceName (String placeName) {
            place.setPlace(placeName);
            place.addText(place.getPlace());
            return this;
        }
        public PlaceComponents addRelativeObject (AbstractObject relativeObject) {
            place.setRelativeObject(relativeObject);
            return this;
        }

        public ObjectPlace build () {
            return place;
        }
        public ObjectPlace defualtBuild () {
            place.setPlace("где-то");
            place.addText(place.getPlace());
            return place;
        }
    }


}
