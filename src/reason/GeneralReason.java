package reason;

import java.util.Objects;

public class GeneralReason implements Reason{
    String curerentReason;
    String prepos;

    {
        curerentReason = "";
        prepos = "";
    }

    public GeneralReason () {}
    public GeneralReason (String reason, String preposition) {
        curerentReason = reason;
        this.prepos = preposition;
    }

    @Override
    public String reas () {
        if (curerentReason.equals("")) return "";
        return prepos + " " + curerentReason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(curerentReason, prepos);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralReason that)) return false;
        return Objects.equals(curerentReason, that.curerentReason) && Objects.equals(prepos, that.prepos);
    }

    @Override
    public String toString() {
        return "GeneralReason{" +
                "curerentReason='" + curerentReason + '\'' +
                ", prepos='" + prepos + '\'' +
                '}';
    }
}
