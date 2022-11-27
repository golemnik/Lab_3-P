package Props;

import position.Position;

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

    private String fullName () {
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
}
