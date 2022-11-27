package Props;

import action.Action;
import action.GeneralAction;
import amount.Pieces;
import position.AbsolutePosition;
import amount.Amount;
import position.Position;

public class Actor extends Entity {
    Position position;
    Amount amount;
    Action action;

    {
        position = new AbsolutePosition();
        amount = new Pieces();
        action = new GeneralAction();
    }
    public Actor() {
        super();
    }
    public Actor (String name) {
        super(name);
    }
    public Actor (Position position) {
        super();
        this.position = position;
    }
    public Actor (String name, Position position) {
        super(name);
        this.position = position;
    }

    @Override
    public void addAction (Action action) {
        this.action = action;
    }

    @Override
    public void addAmount (int amount) {
        this.amount = new Pieces(amount);
    }
    @Override
    public void addPosition (Position newPosition) {
        this.position = newPosition;
    }
    @Override
    public String text () {
        return this.amount.amount() + " " + this.getName() + " " + this.position.place() + " " + this.action.act();
    }
}
