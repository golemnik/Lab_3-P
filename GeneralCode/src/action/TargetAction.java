package action;

import exeptions.TargetException;
import object.AbstractObject;
import object.SimpleObjectBuilder;

public class TargetAction extends AbstractAction {
    private AbstractObject target;
    private String preposition;
    public TargetAction () {
    }
    protected void setPreposition(String preposition) {
        this.preposition = preposition;
    }
    protected String getPreposition() {
        return this.preposition;
    }

    protected void setTarget (AbstractObject target) {
        this.target = target;
    }
    protected AbstractObject getTarget() {
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
            obj.setAction(name);
            return this;
        }
        public TargetActionBuilder addPreposition (String preposition) {
            obj.setPreposition(preposition);
            return this;
        }
        public TargetActionBuilder addTarget (AbstractObject target) {
            obj.setTarget(target);
            targeted = true;
            return this;
        }
        protected void formText () {
            obj.addText(obj.getActionName() + " " + obj.getPreposition() + " " + obj.getTarget().getFullStatus());
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
