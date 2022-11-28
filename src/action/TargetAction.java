package action;

import Props.Entity;

public class TargetAction extends AbstractAction implements Action{

    private Entity target[];
    private String prepos;

    public TargetAction (String actMove, Entity ... target) {
        super("взаимодействует");
        this.target = target;
        this.prepos = actMove;
    }
    public TargetAction (String name, String actMove, Entity ... target) {
        super(name);
        this.target = target;
        this.prepos = actMove;
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
    public String act () {
        return this.getName() + " " + prepos + " " + fullName();
    }
}
