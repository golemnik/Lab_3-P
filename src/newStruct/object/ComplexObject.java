package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.status.Status;

public class ComplexObject extends AbstractComplexObject {
    private Place place[];
    private Action action[];
    private Status status[];
    private SimpleObject parts [];

    public ComplexObject () {

    }
    @Override
    public void setPlaces (Place[] place) {
        this.place = place;
    }
    @Override
    public void setActions (Action[] action) {
        this.action = action;
    }
    @Override
    public void setStatus (Status[] status) {
        this.status = status;
    }
    public void setParts (SimpleObject [] parts) {
        this.parts = parts;
    }

    @Override
    public String getFullParts () {
        String fullParts = "";
        for (int i = 0; i < parts.length; i++) {
            fullParts += parts[i].getFullStatus() + " ";
        }
        return fullParts;
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
        return this.getFullStatus() + getFullParts() + this.getFullPlace() + this.getFullAction();
    }
}
