package newStruct;

public abstract class AbstractAction {
    private String name;

    {
        name = "бездействует";
    }
    public AbstractAction () {
    }
    public AbstractAction (String name) {
        this.name = name;
    }

    String getName () {return name;}
}
