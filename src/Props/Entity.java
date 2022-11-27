package Props;

import action.Action;
import amount.Amount;
import amount.Pieces;
import position.Position;

public abstract class Entity {
    private String name;

    {
        name = "кто-то";
    }
    public Entity (){}
    public Entity (String name) {this.name = name;}

    public String getName () {return name;}
    public abstract void addAction (Action action);
    public abstract void addPosition (Position newPosition);
    public abstract void addAmount (int amount);

    public abstract String text();
}
