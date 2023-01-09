package place;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;

public class TargetPlace extends AbstractPlace {
    AbstractObject object;
    public TargetPlace() {
    }
    private void setRelativeObject (AbstractObject relativeObject) {
        object = relativeObject;
    }
    @Override
    public String text() {
        return getText();
    }
    @Override
    public TargetPlaceBuilder builder() {
        return new TargetPlaceBuilder();
    }
    public class TargetPlaceBuilder extends AbstractPlaceBuilder {
        private final TargetPlace obj;
        private boolean targeted = false;
        public TargetPlaceBuilder () {
            obj = new TargetPlace();
        }
        @Override
        public TargetPlaceBuilder addPlaceName (String name) {
            obj.setPlace(name);
            obj.addText(obj.getPlace());
            return this;
        }
        public TargetPlaceBuilder addRelativeObject (AbstractObject relativeObject) {
            setRelativeObject(relativeObject);
            addText("около " + relativeObject.getFullStatus());
            targeted = true;
            return this;
        }
        @Override
        public TargetPlace build() throws TargetException {
            if (!targeted) {
                throw new TargetException();
            }
            return obj;
        }
        @Override
        public TargetPlace defaultBuild () {
            addPlaceName("что-то делает");
            addRelativeObject(new SimpleObjectBuilder().defaultBuild());
            return obj;
        }
    }
}
