package action;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;

public class TargetAction extends AbstractAction {
    private AbstractObject target;
    public TargetAction () {
    }

    private void setTarget (AbstractObject target) {
        this.target = target;
    }
    private AbstractObject getTarget() {
        return this.target;
    }
    @Override
    public TargetActionBuilder builder(){
        return new TargetActionBuilder();
    }
    public static class TargetActionBuilder extends AbstractActionBuilder {
        private final TargetAction obj;
        private boolean targeted = false;
        public TargetActionBuilder() {
            obj = new TargetAction();
        }
        protected void setTargeted (boolean targeted) {
            this.targeted = targeted;
        }
        protected boolean getTargeted () {
            return this.targeted;
        }
        @Override
        public TargetActionBuilder addName (String name) {
            obj.setActionName(name);
            return this;
        }
        @Override
        protected String takeName() {
            return obj.getActionName();
        }
        public TargetActionBuilder addPreposition (String preposition) {
            obj.setPreposition(preposition);
            return this;
        }
        protected String takePreposition () {
            return obj.getPreposition();
        }
        public TargetActionBuilder addTarget (AbstractObject target) {
            obj.setTarget(target);
            targeted = true;
            return this;
        }
        protected AbstractObject takeTarget () {
            return obj.getTarget();
        }
        protected void formText () {
            obj.addText(takeName() + " " + takePreposition() + " " + takeTarget().getFullStatus());
        }
        @Override
        public TargetAction build () throws TargetException {
            if (!getTargeted()) {
                throw new TargetException();
            }
            formText();
            return obj;
        }
        @Override
        public TargetAction defaultBuild () {
            addName("что-то делает");
            addPreposition("с");
            addTarget(new SimpleObjectBuilder().defaultBuild());
            formText();
            return obj;
        }
    }
}
