package Props;

import Status.*;
import action.*;
import amount.*;
import position.*;

public class Actor extends Entity {
    Position position;
    Amount amount;
    Action action;
    Status status;

    {
        position = new AbsolutePosition();
        amount = new Pieces();
        action = new GeneralAction();
        status = new GeneralStatus();
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
    public String fullName () {
        return getName();
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
    public void addStatus (Status status) {
        this.status = status;
    }

    @Override
    public String text () {
        return this.amount.amount() + " " + this.getName() + "" + this.status.stat() + " " + this.position.place() + " " + this.action.act();
    }
}
