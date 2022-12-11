package newStruct.action;

import oldStruct.action.AbstractAction;

public class UnknownAction extends AbstractAction implements Action {
    @Override
    public String act() {
        return "что-то делает";
    }
}
