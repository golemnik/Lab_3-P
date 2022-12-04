package newStruct;

import newStruct.object.AbstractObject;

public class TargetAction extends AbstractAction implements Action{
    private AbstractObject [] target;
    private String preposition;
    public TargetAction (AbstractObject [] target) {
        this.target = target;
    }
    public TargetAction (String name, String preposition, AbstractObject [] target) {
        super(name);
        this.target = target;
        this.preposition = preposition;
    }
    private String fullName () {
        String fullName = "";
        for (int i = 0; i < target.length; i++) {
            fullName += target[i].text();
            if (i+1 != target.length) fullName += " и ";
        }
        return fullName;
    }

    @Override
    public String act() {
        return this.getName() + " " + this.preposition + " " + fullName();
    }
}
