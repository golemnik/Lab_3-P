package Props;

import Status.Status;
import action.Action;
import position.Position;

public abstract class Entity {
    private String name;

    {
        name = "кто-то";
    }
    public Entity (){}
    public Entity (String name) {this.name = name;}

    public String getName () {return name;}

    public abstract String fullName ();
    public abstract void addAction (Action action);
    public abstract void addPosition (Position newPosition);
    public abstract void addAmount (int amount);
    public abstract void addStatus (Status status);

    public abstract String text();
}
