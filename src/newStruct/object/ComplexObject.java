package newStruct.object;

import newStruct.Action;
import newStruct.place.Place;
import newStruct.other.Status;

public class ComplexObject extends AbstractComplexObject {
    private String name[];
    private Place place[];
    private Action action[];
    private Status status[];
    private SimpleObject parts [];

    public ComplexObject () {

    }
    @Override
    public void setNames (String [] name) {
        this.name = name;
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
    public String text () {
        return "Compl obj";
    }

}
