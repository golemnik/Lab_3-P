package action;

import exeptions.PlacementException;
import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;
import place.GeneralPlace;
import place.Place;
import status.GeneralStats;

public class MultiTargetToPlaceAction extends MultiTargetAction{
    private Place targetsPlace;
    private boolean placemented = false;
    protected void setTargetPlace (Place targetsPlace) {
        this.targetsPlace = targetsPlace;
    }
    protected Place getTargetPlace () {
        return this.targetsPlace;
    }

    public MultiTargetToPlaceAction() {}
    @Override
    public MultiTargetToPlaceActionBuilder builder(){
        return new MultiTargetToPlaceActionBuilder();
    }
    public static class MultiTargetToPlaceActionBuilder extends MultiTargetActionBuilder {
        private final MultiTargetToPlaceAction obj;
        protected void setPlacemented (boolean placemented) {
            obj.placemented = placemented;
        }
        protected boolean getPlacemented () {
            return obj.placemented;
        }
        public MultiTargetToPlaceActionBuilder() {
            obj = new MultiTargetToPlaceAction();
        }
        @Override
        public MultiTargetToPlaceActionBuilder addName(String name) {
            super.addName(name);
            return this;
        }
        @Override
        protected String takeName() {
            return super.takeName();
        }
        @Override
        public MultiTargetToPlaceActionBuilder addPreposition(String preposition) {
            super.addPreposition(preposition);
            return this;
        }
        @Override
        protected String takePreposition() {
            return super.takePreposition();
        }
        public MultiTargetToPlaceActionBuilder addUnion(String union) {
            super.addUnion(union);
            return this;
        }
        @Override
        protected String takeUnion() {
            return super.takeUnion();
        }
        @Override
        public MultiTargetToPlaceActionBuilder addTarget (AbstractObject target) {
            super.addTarget(target);
            return this;
        }
        public MultiTargetToPlaceActionBuilder addTargetArray(AbstractObject[] targets) {
            super.addTargetArray(targets);
            return this;
        }
        @Override
        protected AbstractObject takeTarget_n(int n) {
            return super.takeTarget_n(n);
        }
        public MultiTargetToPlaceActionBuilder addTargetsPlace (Place place) {
            for (int i = 0; i < super.takeTargetArray().length; i++) {
                super.takeTargetArray()[i].setPlace(place);
            }
            setPlacemented(true);
            return this;
        }
        protected Place takeTargetPlace () {
            return obj.getTargetPlace();
        }
        protected void formText () {
            obj.addText(takeName() + " ");
            for (int i = 0; i < obj.getTargets().length; i++) {
                obj.addText(takeTarget_n(i).getFullStatus() + " ");
                if (i != obj.getTargets().length-1) {
                    obj.addText(obj.getUnion() + " ");
                }
            }
            obj.addText(takePreposition() + " " + takeTargetPlace());
        }
        @Override
        public MultiTargetToPlaceAction build () throws TargetException, PlacementException {
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
        public MultiTargetToPlaceAction defaultBuild () {
            addName("что-то делает");
            addPreposition("с");
            addUnion("и");
            addTarget(new SimpleObjectBuilder().setObjStatus(new GeneralStats().builder().addName("obj_1").build()).build());
            addTarget(new SimpleObjectBuilder().setObjStatus(new GeneralStats().builder().addName("obj_2").build()).build());
            addTargetsPlace(new GeneralPlace().builder().defaultBuild());
            formText();
            return obj;
        }
    }
}