package action;

import object.AbstractObject;

public class MultiTargetAction extends AbstractAction implements Action{
    private AbstractObject [] target;
    private String preposition;
    private String union;
    public MultiTargetAction(String action, String preposition, AbstractObject [] target, String union) {
        this.setAction(action);
        this.target = target;
        this.preposition = preposition;
        this.union = union;
    }
    public String getTargetStatus () {
        String status = "";
        for (int i = 0; i < target.length; i++) {
            status+=target[i].getFullStatus() + " " + target[i].getFullPlace();
            if (i+1 < target.length) status += " " + union + " ";
        }
        return status;
    }

    @Override
    public String act() {
        return this.getAction() + " " + this.preposition + " " + this.getTargetStatus();
    }
}
