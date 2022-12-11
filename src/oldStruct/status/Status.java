package oldStruct.status;

import oldStruct.reason.Reason;

public abstract class Status {
    private String name;

    Status (String name) {
        this.name = name;
    }
    public abstract void addReason (Reason reason);

    public String getName () {
        return name;
    }

    public abstract String stat ();
}
