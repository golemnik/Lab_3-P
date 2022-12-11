package newStruct.object;

import newStruct.Action;
import newStruct.UnknownAction;
import newStruct.place.Place;
import newStruct.status.Status;
import newStruct.place.UnknownPlace;
import newStruct.status.UnknownStatus;

public class SimpleObject extends AbstractObject {
    private String name[];
    private Place place[];
    private Action action[];
    private Status status[];
    {
        this.name = new String[] {"кто-то"};
        this.place = new Place[] {new UnknownPlace()};
        this.status = new Status[] {new UnknownStatus()};
        this.action = new Action[] {new UnknownAction()};
    }

    public SimpleObject () {

    }
    @Override
    public void setPlaces (Place [] place) {
        this.place = place;
    }
    @Override
    public void setActions (Action [] action) {
        this.action = action;
    }
    @Override
    public void setStatus (Status [] status) {
        this.status = status;
    }
    @Override
    public String getFullPlace () {
        String fullPlace = "";
        for (int i = 0; i < place.length; i++) {
            fullPlace += place[i].loc() + " ";
        }
        return fullPlace;
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
        String fullStatus = "";
        for (int i = 0; i < status.length; i++) {
            fullStatus += status[i].stat() + " ";
        }
        return fullStatus;
    }

    @Override
    public String text () {
        return this.getFullStatus() + this.getFullPlace() + this.getFullAction();
    }


}
