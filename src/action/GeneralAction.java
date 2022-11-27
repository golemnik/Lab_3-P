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
}
