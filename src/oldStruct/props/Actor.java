package oldStruct.props;

import oldStruct.status.*;
import oldStruct.action.*;
import oldStruct.amount.*;
import oldStruct.position.*;

import java.util.Arrays;
import java.util.Objects;

public class Actor extends Entity {
    Position position;
    Amount amount;
    Action action;
    Action actions[];
    Status status;

    {
        position = new AbsolutePosition();
        amount = new Pieces();
        action = new GeneralAction();
        actions = new Action[0];
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
    public String multiAction () {
        String act = " ";
        for (int i = 0; i < actions.length; i++) {
            act += actions[i].act();
            if (i+1 != actions.length) {
                switch (i+1) {
                    case 1:
                        act += ", " + ActionOrder.потом + "\n";
                        break;
                    case 2:
                        act += ", " + ActionOrder.затем + "\n";
                        break;
                    default:
                        act += ", " + ActionOrder.следом + "\n";
                        break;
                }
                act += " ";
            }

            }
        return act;
    }

    @Override
    public void addAction (Action action) {
        this.action = action;
    }

    @Override
    public void addAction (Action ... actions) {
        this.actions = actions;
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
        String action = " ";
        if (actions.length == 0) action += this.action.act();
        else action = multiAction();
        return this.amount.amount() + " " + this.getName() + " " + this.status.stat()
                + this.position.place() + action;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "oldStruct.position=" + position +
                ", oldStruct.amount=" + amount +
                ", oldStruct.action=" + action +
                ", actions=" + Arrays.toString(actions) +
                ", oldStruct.status=" + status +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(position, amount, action, status);
        result = 31 * result + Arrays.hashCode(actions);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false;
        return Objects.equals(position, actor.position) &&
                Objects.equals(amount, actor.amount) &&
                Objects.equals(action, actor.action) &&
                Arrays.equals(actions, actor.actions) &&
                Objects.equals(status, actor.status);
    }
}
