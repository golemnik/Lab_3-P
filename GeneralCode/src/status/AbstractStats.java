package status;

public abstract class AbstractStats implements Stats {
    private String text;
    private String objectStatus;
    private String objectName;
    private int amount;
    {
        text = "";
        objectStatus = "";
        objectName = "";
        amount = 1;
    }
    public AbstractStats() {}

    public void setStatus (String status) {this.objectStatus = status;}
    public String getStatus () {return this.objectStatus;}
    public void setName (String name) {this.objectName = name;}
    public String getName () {return this.objectName;}
    public void addText (String text) {
        this.text += text + " ";
    }
    public String getText () {return text;}

    public void setAmount (int amount) {this.amount = amount;}
    public String getAmount () {
        return String.valueOf(amount);
    }

    public AbstractStatusComponents builder () {
        return new AbstractStatusComponents();
    };

    public static class AbstractStatusComponents {
        private final AbstractStats stats;
        public AbstractStatusComponents () {
            stats = new GeneralStats();
        }
        public AbstractStatusComponents addName (String name) {
            stats.setName(name);
            stats.addText(stats.getName());
            return this;
        }
        public AbstractStatusComponents addAmount (int amount) {
            stats.setAmount(amount);
            stats.addText(stats.getAmount());
            return this;
        }
        public AbstractStatusComponents addStatus (String status) {
            stats.setStatus(status);
            stats.addText(stats.getStatus());
            return this;
        }
        public AbstractStats build () {
            return stats;
        }
        public AbstractStats defualtBuild () {
            addName("кто-то");
            stats.addText(stats.getName());
            addStatus("какой-то");
            stats.addText(stats.getStatus());
            return stats;
        }
    }

}
