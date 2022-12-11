package newStruct.object;

import newStruct.action.Action;
import newStruct.action.UnknownAction;
import newStruct.place.Place;
import newStruct.status.Status;
import newStruct.place.UnknownPlace;
import newStruct.status.UnknownStatus;

public class SimpleObject extends AbstractObject implements Obj {
    private Place place;
    private Action[] action;
    private Status status;
    {
        this.place = new UnknownPlace();
        this.status = new UnknownStatus();
        this.action = new Action[] {new UnknownAction()};
    }

    public SimpleObject () {

    }
    @Override
    public void setPlaces (Place place) {
        this.place = place;
    }
    @Override
    public void setActions (Action [] action) {
        this.action = action;
    }
    @Override
    public void setStatus (Status status) {
        this.status = status;
    }
    @Override
    public String getFullPlace () {
        return place.loc();
    }
    @Override
    public String getFullAction () {
        String fullAction = "";
        for (int i = 0; i < action.length; i++) {
            fullAction += action[i].act() + " ";
        }
        return fullAction;
    }
    @Override
    public String getFullStatus () {
        return status.stat();
    }

    @Override
    public String text () {
        return this.getFullStatus() + this.getFullPlace() + this.getFullAction();
    }


}
