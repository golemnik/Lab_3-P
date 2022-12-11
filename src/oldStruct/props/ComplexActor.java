package oldStruct.props;

import oldStruct.position.Position;

import java.util.Arrays;

public class ComplexActor extends Actor {
    Actor[] parts;

    public ComplexActor (Actor ... parts) {
        super();
        this.parts = parts;
    }
    public ComplexActor (String name, Actor ... parts) {
        super(name);
        this.parts = parts;
    }
    public ComplexActor (Position position, Actor ... parts) {
        super();
        this.position = position;
        this.parts = parts;
    }
    public ComplexActor (String name, Position position, Actor ... parts) {
        super(name);
        this.position = position;
        this.parts = parts;
    }

    @Override
    public String fullName () {
        String fullName = "";
        for (int i = 0; i < parts.length; i++) {
            fullName += parts[i].getName();
            if (i+1 != parts.length) fullName += ", ";
        }
        return this.getName() + " из " + fullName;
    }

    @Override
    public String text () {
        return this.amount.amount() + " " + fullName() + " " + this.position.place() + " " + this.action.act();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(parts);
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexActor that)) return false;
        if (!super.equals(o)) return false;
        return Arrays.equals(parts, that.parts);
    }

    @Override
    public String toString() {
        return "ComplexActor{" +
                "parts=" + Arrays.toString(parts) +
                "oldStruct.position=" + position +
                ", oldStruct.amount=" + amount +
                ", oldStruct.action=" + action +
                ", actions=" + Arrays.toString(actions) +
                ", oldStruct.status=" + status +
                '}';
    }
}
