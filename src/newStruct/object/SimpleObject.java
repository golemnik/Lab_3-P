package newStruct.object;

import newStruct.Action;
import newStruct.other.Place;
import newStruct.other.Status;

import java.util.Arrays;

public class SimpleObject extends AbstractObject {
    private String name[];
    private Place place[];
    private Action action[];
    private Status status[];

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

    @Override
    public String text () {
        return "Simple obj";
    }


}
