package action;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;
import place.Place;

public class MultiTargetToPlaceAction extends MultiTargetAction{
    private Place targetsPlace;
    private boolean placemented = false;
    protected void setTargetPlace (Place targetsPlace) {
        this.targetsPlace = targetsPlace;
    }
    protected Place getTargetPlace () {
        return this.targetsPlace;
    }
    protected void setPlacemented (boolean placemented) {
        this.placemented = placemented;
    }
    protected boolean getPlacemented () {
        return this.placemented;
    }
    public MultiTargetToPlaceAction() {}
    @Override
    public MultiTargetToPlaceActionBuilder builder(){
        return new MultiTargetToPlaceActionBuilder();
    }
    public static class MultiTargetToPlaceActionBuilder extends MultiTargetActionBuilder {
        private final MultiTargetToPlaceAction obj;
        public MultiTargetToPlaceActionBuilder() {
            obj = new MultiTargetToPlaceAction();
        }
        @Override
        public MultiTargetToPlaceActionBuilder addName(String name) {
            super.addName(name);
            return this;
        }
        @Override
        public MultiTargetToPlaceActionBuilder addPreposition(String preposition) {
            obj.setPreposition(preposition);
            return this;
        }
        public MultiTargetToPlaceActionBuilder addUnion(String union) {
            obj.setUnion(union);
            return this;
        }
        @Override
        public MultiTargetToPlaceActionBuilder addTarget (AbstractObject target) {
            super.addTarget(target);
            return this;
        }
        public MultiTargetToPlaceActionBuilder addNewTargetArray (AbstractObject[] targets) {
            super.addNewTargetArray(targets);
            return this;
        }

        @Override
        protected AbstractObject takeTargets(int n) {
            return super.takeTargets(n);
        }

        public MultiTargetToPlaceActionBuilder addTargetPlace (Place place) {
            obj.setTargetPlace(place);
            super.takeTarget().setPlace(place);
            obj.setPlacemented(true);
            return this;
        }
        protected Place takeTargetPlace () {
            return obj.getTargetPlace();
        }

        protected void formText () {
            obj.addText(obj.getActionName() + " ");
            for (int i = 0; i < obj.getTargets().length; i++) {
                obj.addText(takeTargets(i).getFullStatus() + " ");
                if (i != obj.getTargets().length-1) {
                    obj.addText(obj.getUnion() + " ");
                }
            }
            obj.addText(takePreposition() + " " + takeTargetPlace());
        }
        @Override
        public MultiTargetToPlaceAction build () throws TargetException {
            if (!getTargeted()) {
                throw new TargetException();
            }
            formText();
            return obj;
        }
        @Override
        public MultiTargetToPlaceAction defaultBuild () {
            addName("что-то делает");
            addPreposition("с");
            addUnion("и");
            addTarget(new SimpleObjectBuilder().defaultBuild());
            addTarget(new SimpleObjectBuilder().defaultBuild());
            formText();
            return obj;
        }
    }
}