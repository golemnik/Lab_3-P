package action;

public abstract class AbstractAction implements Action {
    private String actionName;
    private String text;

    {
        actionName = "бездействует";
    }
    public AbstractAction() {}
    protected void setAction (String action) {
        this.actionName = action;
    }
    protected String getActionName() {return actionName;}
    protected void addText (String text) {
        this.text += text + " ";
    }
    public String getText () {return text;}

    public abstract AbstractActionBuilder builder();
    public abstract static class AbstractActionBuilder {
        public AbstractActionBuilder() {}
        public abstract AbstractActionBuilder addName (String name);
        protected abstract void formText ();
        public abstract AbstractAction build();
        public abstract AbstractAction defaultBuild ();
    }
}
