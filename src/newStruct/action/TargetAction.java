package newStruct.action;

import newStruct.object.AbstractObject;

public class TargetAction extends AbstractAction implements Action{
    private AbstractObject target;
    private String preposition;
    public TargetAction (String action, String preposition, AbstractObject target) {
        this.setAction(action);
        this.target = target;
        this.preposition = preposition;
    }

    @Override
    public String act() {
        return this.getAction() + " " + this.preposition + " " + this.target.getFullStatus();
    }
}
