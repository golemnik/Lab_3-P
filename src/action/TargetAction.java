package action;

import Props.Entity;

public class TargetAction extends AbstractAction implements Action{

    private Entity target;
    private String actMove;

    public TargetAction (Entity target, String actMove) {
        super("взаимодействует");
        this.target = target;
        this.actMove = actMove;
    }
    public TargetAction (String name, Entity target, String actMove) {
        super(name);
        this.target = target;
        this.actMove = actMove;
    }

    @Override
    public String act () {
        return this.getName() + " " + actMove + " " + target.getName();
    }
}
