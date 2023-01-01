package object;

import action.Action;
import action.UnknownAction;
import place.Place;
import place.UnknownPlace;
import status.Stats;
import status.UnknownStats;
import action.ActionOrder;

public abstract class AbstractObject implements Obj{
    private Place place;
    private Action[] action;
    private Stats status;
    {
        this.place = new UnknownPlace();
        this.status = new UnknownStats();
        this.action = new Action[] {new UnknownAction()};
    }

    public AbstractObject () {}
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
        return place.loc();
    }
    public String getFullAction () {
        String fullAction = "";
        for (int i = 0; i < action.length; i++) {
            fullAction += action[i].act() + " ";
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
