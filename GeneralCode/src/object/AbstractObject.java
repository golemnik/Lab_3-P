package object;

import action.Action;
import action.NonTargetAction;
import exeptions.ObjectAmountException;
import place.GeneralPlace;
import place.Place;
import status.GeneralStats;
import status.Stats;
import action.ActionOrder;

public abstract class AbstractObject implements Obj{
    private Place place;
    private Action[] action;
    private Stats status;

    public AbstractObject () {
        this.place = new GeneralPlace().builder().defaultBuild();
        this.status = new GeneralStats().builder().defualtBuild();
        this.action = new Action[] {new NonTargetAction().builder().defaultBuild()};
    }
    public void setPlaces (Place place) {
        this.place = place;
    }
    public void setActions (Action [] action) {
        this.action = action;
    }
    public void setStatus (Stats status) {
        this.status = status;
    }
    public String getFullPlace () {
        return place.text();
    }
    public String getFullAction () {
        String fullAction = "";
        for (int i = 0; i < action.length; i++) {
            fullAction += action[i].getText() + " ";
            if (i+1 == action.length);
            else {
                switch (i){
                    case 0:
                        fullAction += ", " + ActionOrder.потом + " ";
                        break;
                    case 1:
                        fullAction += ", " + ActionOrder.затем + " ";
                        break;
                    default:
                        fullAction += ", " + ActionOrder.следом + " ";
                        break;
                }
            }
        }
        return fullAction;
    }
    public String getFullStatus () {
        return status.text();
    }
}
