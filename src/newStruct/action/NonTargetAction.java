package newStruct.action;


public class NonTargetAction extends AbstractAction implements Action {
    NonTargetAction (String action) {
        this.setAction(action);
    }

    @Override
    public String act() {
        return getAction();
    }
}