package newStruct.object;

import newStruct.action.Action;
import newStruct.action.UnknownAction;
import newStruct.place.Place;
import newStruct.place.UnknownPlace;
import newStruct.status.Status;
import newStruct.status.UnknownStatus;

public abstract class AbstractObject implements Obj{
    private Place place;
    private Action[] action;
    private Status status;
    {
        this.place = new UnknownPlace();
        this.status = new UnknownStatus();
        this.action = new Action[] {new UnknownAction()};
    }

    public AbstractObject () {}
    public void setPlaces (Place place) {
        this.place = place;
    }
    public void setActions (Action [] action) {
        this.action = action;
    }
    public void setStatus (Status status) {
        this.status = status;
    }
    public String getFullPlace () {
        return place.loc();
    }
    public String getFullAction () {
        String fullAction = "";
        for (int i = 0; i < action.length; i++) {
            fullAction += action[i].act() + " ";
        }
        return fullAction;
    }
    public String getFullStatus () {
        return status.stat();
    }
}
