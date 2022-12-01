package action;


public class GeneralAction extends AbstractAction implements Action {
    public GeneralAction () {
        super();
    }
    public GeneralAction (String name) {
        super(name);
    }

    @Override
    public String act () {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
