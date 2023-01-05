package action;

public abstract class AbstractAction {
    private String action;

    {
        action = "бездействует";
    }
    public AbstractAction () {}
    public  void setAction (String action) {
        this.action = action;
    }
    public String getAction () {return action;}
}
