package newStruct;


public class NonTargetAction extends AbstractAction implements Action {
    NonTargetAction (String name) {
        super(name);
    }

    @Override
    public String act() {
        return getName();
    }
}
