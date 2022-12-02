package newStruct;

import newStruct.other.Action;
import newStruct.other.Place;
import newStruct.other.Status;

public class SimpleObject extends AbstrastObject {
    private String name[];
    private Place place[];
    private Action action[];
    private Status status[];

    public void setNames (String ... name) {
        this.name = name;
    }
    public void setPlaces (Place ... place) {
        this.place = place;
    }
    public void setActions (Action ... action) {
        this.action = action;
    }
    public void setStatus (Status ... status) {
        this.status = status;
    }

    String text () {
        return "";
    }


}
