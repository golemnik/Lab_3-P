package place;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;

public class TargetPlace extends AbstractPlace {
    public AbstractObject object;
    public TargetPlace() {
    }
    private void setRelativeObject (AbstractObject relativeObject) {
        object = relativeObject;
    }
    private AbstractObject getRelativeObject () {
        return object;
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
            obj.setPlaceName(name);
            obj.addText(obj.getPlaceName());
            return this;
        }
        public TargetPlaceBuilder addRelativeObject (AbstractObject relativeObject) {
            setRelativeObject(relativeObject);
            addText("около " + relativeObject.getFullStatus());
            targeted = true;
            return this;
        }
        @Override
        public TargetPlaceBuilder addPreposition (String preposition) {
            obj.setPreposition(preposition);
            return this;
        }

        @Override
        protected void formText() {
            obj.addText(obj.getPlaceName() + " " + obj.getPreposition() + " " + obj.getRelativeObject().getFullStatus());
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
            addPreposition("около");
            addRelativeObject(new SimpleObjectBuilder().defaultBuild());
            formText();
            return obj;
        }
    }
}
