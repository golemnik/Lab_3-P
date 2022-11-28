package action;

import Props.Actor;
import Props.Entity;
import position.RelativePosition;

public class ObjToTargetAction extends AbstractAction implements Action{

    private Entity target;
    private Entity[] objects;
    private String prepos;

    public ObjToTargetAction (Entity target, String actMove, Actor ... objects) {
        super("взаимодействует");
        this.target = target;
        this.prepos = actMove;
        this.objects = objects;
    }
    public ObjToTargetAction (String name, Entity target, String actMove, Entity ... objects) {
        super(name);
        this.target = target;
        this.prepos = actMove;
        this.objects = objects;
    }

    private void updateObjects () {
        for (int i = 0; i < objects.length; i++) {
            objects[i].addPosition(new RelativePosition(target, prepos));
            objects[i].addAction(new GeneralAction());
        }
    }

    private String fullName () {
        updateObjects();
        String fullName = "";
        for (int i = 0; i < objects.length; i++) {
            fullName += objects[i].text();
            if (i+1 != objects.length) fullName += ", ";
        }
        return fullName;
    }

    @Override
    public String act () {
        return this.getName() + " " + fullName() + " " + prepos + " " + target.getName();
    }
}
