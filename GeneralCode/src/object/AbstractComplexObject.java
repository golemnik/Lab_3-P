package object;

import action.Action;
import action.UnknownAction;
import place.GeneralPlace;
import status.GeneralStats;

public abstract class AbstractComplexObject extends AbstractObject {
    private SimpleObject[] parts;

    {
        this.setPlaces(new GeneralPlace().builder().defaultBuild());
        this.setStatus(new GeneralStats().builder().defualtBuild());
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
