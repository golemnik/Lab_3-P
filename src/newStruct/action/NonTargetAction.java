package newStruct.action;


public class NonTargetAction extends AbstractAction implements Action {
    public NonTargetAction (String action) {
        this.setAction(action);
    }

    @Override
    public String act() {
        return getAction();
    }
}
