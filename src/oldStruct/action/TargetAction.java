package oldStruct.action;

import oldStruct.props.Entity;

import java.util.Arrays;
import java.util.Objects;

public class TargetAction extends AbstractAction implements Action{

    private Entity target[];
    private String prepos;
    public TargetAction (String name, Entity ... target) {
        super(name);
        this.prepos = "";
        this.target = target;
    }
    public TargetAction (Entity ... target) {
        super("взаимодействует");
        this.prepos = "c";
        this.target = target;
    }
    public TargetAction (String name, String preposition, Entity ... target) {
        super(name);
        this.target = target;
        this.prepos = preposition;
    }

    private String fullName () {
        String fullName = "";
        for (int i = 0; i < target.length; i++) {
            fullName += target[i].text();
            if (i+1 != target.length) fullName += " и ";
        }
        return fullName;
    }

    @Override
    public String act () {
        return this.getName() + " " + prepos + " " + fullName();
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(prepos);
        result = 31 * result + Arrays.hashCode(target);
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TargetAction that)) return false;
        return Arrays.equals(target, that.target) && Objects.equals(prepos, that.prepos);
    }

    @Override
    public String toString() {
        return "TargetAction{" +
                "target=" + Arrays.toString(target) +
                ", prepos='" + prepos + '\'' +
                '}';
    }
}
