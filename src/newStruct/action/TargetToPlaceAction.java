package newStruct.action;

import newStruct.object.Obj;
import newStruct.place.Place;

public class TargetToPlaceAction extends AbstractAction implements Action{
    private Obj target;
    private Place place;
    private String preposition;
    public TargetToPlaceAction(Obj target, String action, String preposition, Place place) {
        this.setAction(action);
        this.target = target;
        this.preposition = preposition;
        this.place = place;
    }

    // update target!
    @Override
    public String act() {
        return this.getAction() + " " + this.target.getFullStatus() + " " + this.preposition + " " + place.loc();
    }
}
