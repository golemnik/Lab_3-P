package action;

import exeptions.PlacementException;
import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;
import place.GeneralPlace;
import place.Place;

public class TargetToPlaceAction extends TargetAction{
    private Place targetPlace;
    protected void setTargetPlace (Place targetPlace) {
        this.targetPlace = targetPlace;
    }
    protected Place getTargetPlace () {
        return this.targetPlace;
    }
    @Override
    public TargetToPlaceActionBuilder builder(){
        return new TargetToPlaceActionBuilder();
    }
    public class TargetToPlaceActionBuilder extends TargetActionBuilder {
        private final TargetToPlaceAction obj;
        private boolean placemented = false;
        public TargetToPlaceActionBuilder() {
            obj = new TargetToPlaceAction();
        }
        protected void setPlacemented (boolean placemented) {
            this.placemented = placemented;
        }
        protected boolean getPlacemented () {
            return this.placemented;
        }
        public TargetToPlaceActionBuilder addTargetPlace (Place place) {
            obj.setTargetPlace(place);
            super.takeTarget().setPlace(place);
            setPlacemented(true);
            return this;
        }
        protected Place takeTargetPlace () {
            return obj.getTargetPlace();
        }
        @Override
        public TargetToPlaceActionBuilder addName(String name) {
            super.addName(name);
            return this;
        }
        @Override
        protected String takeName() {
            return super.takeName();
        }
        @Override
        public TargetToPlaceActionBuilder addPreposition(String preposition) {
            super.addPreposition(preposition);
            return this;
        }
        @Override
        protected String takePreposition() {
            return super.takePreposition();
        }
        @Override
        public TargetToPlaceActionBuilder addTarget(AbstractObject target) {
            super.addTarget(target);
            return this;
        }
        @Override
        protected AbstractObject takeTarget() {
            return super.takeTarget();
        }
        @Override
        protected void formText() {
            obj.addText(takeName() + " " + takeTarget().getFullStatus() + " " + takePreposition() + " " + takeTargetPlace().text());
        }
        @Override
        public TargetAction build () throws TargetException, PlacementException {
            if (!getTargeted()) {
                throw new TargetException();
            }
            if (!getPlacemented()) {
                throw new PlacementException();
            }
            formText();
            return obj;
        }
        @Override
        public TargetAction defaultBuild () {
            addName("переместил");
            addPreposition("в");
            addTarget(new SimpleObjectBuilder().defaultBuild());
            addTargetPlace(new GeneralPlace().builder().defaultBuild());
            formText();
            return obj;
        }
    }

}
