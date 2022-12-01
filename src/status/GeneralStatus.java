package status;

import reason.*;

import java.util.Objects;

public class GeneralStatus extends Status{
    Reason currentReason;

    {
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
        if (this.getName().equals("") && currentReason.reas().equals("")) return "";
        return this.getName() + " " + currentReason.reas() + " ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentReason);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralStatus that)) return false;
        return Objects.equals(currentReason, that.currentReason);
    }

    @Override
    public String toString() {
        return "GeneralStatus{" +
                "currentReason=" + currentReason +
                '}';
    }
}
