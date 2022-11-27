package action;

public abstract class AbstractAction implements Action{
    private String name;

    {
        name = "бездействует";
    }
    public AbstractAction () {}

    public AbstractAction (String name) {
        this.name = name;
    }

    String getName () {return name;}
}
