package newStruct.object;

import newStruct.action.Action;
import newStruct.action.UnknownAction;
import newStruct.place.UnknownPlace;
import newStruct.status.UnknownStatus;

public abstract class AbstractComplexObject extends AbstractObject {
    private SimpleObject[] parts;

    {
        this.setPlaces(new UnknownPlace());
        this.setStatus(new UnknownStatus());
        this.setActions(new Action[] {new UnknownAction()});
    }
    public void setParts (SimpleObject [] parts) {
        this.parts = parts;
    }
    public String getFullParts () {
        String fullParts = "из ";
        for (int i = 0; i < parts.length; i++) {
            fullParts += parts[i].getFullStatus() + " ";
        }
        return fullParts;
    }
}
