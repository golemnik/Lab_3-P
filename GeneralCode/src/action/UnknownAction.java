package action;

public class UnknownAction extends AbstractAction implements Action {
    @Override
    public String act() {
        return "что-то делает";
    }
}
