package action;

public abstract class AbstractAction implements Action {
    private String actionName;
    private String preposition;
    private String text;
    public AbstractAction() {
        text = "";
    }
    protected void setActionName(String action) {
        this.actionName = action;
    }
    protected String getActionName() {return actionName;}
    protected void addText (String text) {
        this.text += text + " ";
    }
    protected void setPreposition(String preposition) {
        this.preposition = preposition;
    }
    protected String getPreposition() {
        return this.preposition;
    }
    public String getText () {return text;}

    public abstract AbstractActionBuilder builder();
    public abstract static class AbstractActionBuilder {
        public AbstractActionBuilder() {}
        public abstract AbstractActionBuilder addName (String name);
        protected abstract String takeName ();
        protected abstract void formText ();
        public abstract AbstractAction build();
        public abstract AbstractAction defaultBuild ();
    }
}
