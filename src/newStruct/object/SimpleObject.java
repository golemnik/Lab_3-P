package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.other.Status;
import newStruct.place.UnknownPlace;

public class SimpleObject extends AbstractObject {
    private String name[];
    private Place place[];
    private Action action[];
    private Status status[];
    {
        this.name = new String[] {"кто-то"};
        this.place = new Place[] {new UnknownPlace()};

    }

    public SimpleObject () {

    }
    @Override
    public void setNames (String [] name) {
        this.name = name;
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

    String getFullName () {
        String fullName = "";
        for (int i = 0; i < name.length; i++) {
            fullName += name[i] + " ";
        }
        return fullName;
    }
    String getFullPlace () {
        String fullPlace = "";
        for (int i = 0; i < place.length; i++) {
            fullPlace += place[i] + " ";
        }
        return fullPlace;
    }
    String getFullAction () {
        String fullAction = "";
        for (int i = 0; i < action.length; i++) {
            fullAction += action[i] + " ";
        }
        return fullAction;
    }
    String getFullStatus () {
        String fullStatus = "";
        for (int i = 0; i < status.length; i++) {
            fullStatus += status[i] + " ";
        }
        return fullStatus;
    }

    @Override
    public String text () {
        return this.getFullName() + this.getFullPlace() + this.getFullAction() + this.getFullStatus();
    }


}
