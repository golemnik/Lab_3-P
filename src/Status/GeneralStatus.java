package Status;

import Reason.*;

public class GeneralStatus extends Status{
    Reason currentReason;

    {
        name = "";
        currentReason = new GeneralReason();
    }

    public GeneralStatus () {
        super("");
    }
    public GeneralStatus (String name) {
        super(name);
    }
    public GeneralStatus (String name, Reason reason) {
        super(name);
        this.currentReason = reason;
    }

    @Override
    public void addReason (Reason newReason) {
        this.currentReason = newReason;
    }

    @Override
    public String stat () {
        if (name.equals("")) return "";
        return name + " " + currentReason.reas();
    }

}
