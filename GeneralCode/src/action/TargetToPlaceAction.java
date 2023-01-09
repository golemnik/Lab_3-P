package action;

import exeptions.PlacementException;
import exeptions.TargetException;
import object.SimpleObjectBuilder;
import place.GeneralPlace;
import place.Place;

public class TargetToPlaceAction extends TargetAction{
    private Place targetPlace;
    // update target!

    protected void setTargetPlace (Place targetPlace) {
        this.targetPlace = targetPlace;
    }
    protected Place getTargetPlace () {
        return this.targetPlace;
    }

    @Override
    public TargetToPlceActionBuilder builder(){
        return new TargetToPlceActionBuilder();
    }
    public class TargetToPlceActionBuilder extends TargetActionBuilder {
        private final TargetToPlaceAction obj;
        private boolean placemented = false;
        // update target!
        public TargetToPlceActionBuilder () {
            obj = new TargetToPlaceAction();
        }

        protected void setPlacemented (boolean placemented) {
            this.placemented = placemented;
        }
        protected boolean getPlacemented () {
            return this.placemented;
        }
        @Override
        protected void formText() {
            obj.addText(obj.getActionName() + " " + obj.getTarget().getFullStatus() + " " + obj.getPreposition() + " " + obj.getTargetPlace().text());
        }

        public TargetToPlceActionBuilder addTargetPlace (Place place) {
            obj.setTargetPlace(place);
            obj.getTarget().setPlaces(place);
            this.placemented = true;
            return this;
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
