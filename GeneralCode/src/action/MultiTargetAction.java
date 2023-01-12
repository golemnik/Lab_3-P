package action;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;
public class MultiTargetAction extends TargetAction {
    private AbstractObject [] targets;
    private String union;
    {
        targets = new AbstractObject[0];
        union = "";
    }
    protected void setTargets (AbstractObject [] targets) {
        this.targets = targets;
    }
    protected AbstractObject[] getTargets () {
        return targets;
    }
    protected void setUnion(String union) {
        this.union = union;
    }
    protected String getUnion() {
        return this.union;
    }
    @Override
    public MultiTargetActionBuilder builder(){
        return new MultiTargetActionBuilder();
    }
    public static class MultiTargetActionBuilder extends TargetActionBuilder {
        private final MultiTargetAction obj;
        public MultiTargetActionBuilder() {
            obj = new MultiTargetAction();
        }
        @Override
        public MultiTargetActionBuilder addName(String name) {
            obj.setActionName(name);
            return this;
        }
        @Override
        protected String takeName() {
            return super.takeName();
        }
        @Override
        public MultiTargetActionBuilder addPreposition(String preposition) {
            obj.setPreposition(preposition);
            return this;
        }
        @Override
        protected String takePreposition() {
            return super.takePreposition();
        }
        public MultiTargetActionBuilder addUnion(String union) {
            obj.setUnion(union);
            return this;
        }
        protected String takeUnion () {
            return obj.getUnion();
        }
        protected AbstractObject takeTarget_n(int n) {
            return obj.getTargets()[n];
        }
        @Override
        public MultiTargetActionBuilder addTarget (AbstractObject target) {
            obj.setTargets(new MultiTargetActionBuilder() {
                private final AbstractObject[] tempArray = new AbstractObject[obj.getTargets().length+1];
                public AbstractObject[] addUpdater(AbstractObject addableObject) {
                    for (int i = 0; i < obj.getTargets().length;i++) {
                        tempArray[i] = obj.getTargets()[i];
                    }
                    tempArray[tempArray.length-1] = addableObject;
                    return tempArray;
                }
            }.addUpdater(target));
            if (obj.getTargets().length >= 2) {
                setTargeted(true);
            }
            return this;
        }
        @Override
        protected AbstractObject takeTarget () {
            return super.takeTarget();
        }
        public MultiTargetActionBuilder addTargetArray(AbstractObject[] targets) {
            obj.setTargets(targets);
            if (obj.getTargets().length >= 2) {
                setTargeted(true);
            }
            return this;
        }
        public AbstractObject[] takeTargetArray () {
            return obj.getTargets();
        }
        protected void formText () {
            obj.addText(obj.getActionName() + " ");
            for (int i = 0; i < obj.getTargets().length; i++) {
                obj.addText(takeTarget_n(i).getFullStatus() + " ");
                if (i != obj.getTargets().length-1) {
                    obj.addText(takeUnion() + " ");
                }
            }
            obj.addText(obj.getPreposition());
        }
        @Override
        public MultiTargetAction build () throws TargetException {
            if (!getTargeted()) {
                throw new TargetException();
            }
            formText();
            return obj;
        }
        @Override
        public MultiTargetAction defaultBuild () {
            addName("что-то делает");
            addPreposition("с");
            addTarget(new SimpleObjectBuilder().defaultBuild());
            formText();
            return obj;
        }
    }
}
