package status;

public abstract class AbstractStats implements Stats {
    private String text;
    private String objectStatus;
    private String objectName;
    private int amount;
    {
        text = "";
        objectStatus = "какой-то";
        objectName = "кто-то";
        amount = 1;
    }
    public AbstractStats() {}

    public void setStatus (String status) {this.objectStatus = status;}
    public String getCondition() {return this.objectStatus;}
    public void setName (String name) {this.objectName = name;}
    public String getName () {return this.objectName;}
    public void addText (String text) {
        this.text += text + " ";
    }
    public String getText () {return text;}

    public void setAmount (int amount) {this.amount = amount;}
    public String getStrAmount() {
        return String.valueOf(amount);
    }

    public abstract AbstractStatusBuilder builder ();

    public abstract static class AbstractStatusBuilder {
        public abstract AbstractStatusBuilder addName (String name);
        public abstract AbstractStatusBuilder addAmount (int amount);
        public abstract AbstractStatusBuilder addStatus (String status);
        protected abstract void formText ();
        public abstract AbstractStats build ();
        public abstract AbstractStats defualtBuild ();
    }

}
