package place;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;

public class TargetPlace extends AbstractPlace {
    private AbstractObject target;
    public TargetPlace() {
    }
    private void setRelativeObject (AbstractObject relativeObject) {
        this.target = relativeObject;
    }
    private AbstractObject getRelativeObject () {
        return this.target;
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
        private TargetPlace obj;
        private boolean targeted = false;
        public TargetPlaceBuilder () {
            obj = new TargetPlace();
        }
        @Override
        public TargetPlaceBuilder addPlaceName (String name) {
            obj.setPlaceName(name);
            return this;
        }
        public TargetPlaceBuilder addRelativeObject (AbstractObject relativeObject) {
            obj.setRelativeObject(relativeObject);
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
            obj.addText(obj.getPlaceName() + " " + obj.getPreposition() + " около " + obj.getRelativeObject().getFullStatus());
        }

        @Override
        public TargetPlace build() throws TargetException {
            if (!targeted) {
                throw new TargetException();
            }
            formText();
            return this.obj;
        }
        @Override
        public TargetPlace defaultBuild () {
            addPlaceName("где-то");
            addPreposition("около");
            addRelativeObject(new SimpleObjectBuilder().defaultBuild());
            return obj;
        }
    }
}
