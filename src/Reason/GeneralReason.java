package Reason;

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
}
