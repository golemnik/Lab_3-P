package Status;

import Reason.Reason;

public abstract class Status {
    String name;

    Status (String name) {
        this.name = name;
    }
    public abstract void addReason (Reason reason);

    public abstract String stat ();
}
