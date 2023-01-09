package status;

import exeptions.ObjectAmountException;

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
    public String getAmount () {
        return String.valueOf(amount);
    }

    public AbstractStatusComponents builder () {
        return new AbstractStatusComponents();
    };

    public class AbstractStatusComponents {
        private final AbstractStats stats;
        public AbstractStatusComponents () {
            stats = new GeneralStats();
        }
        public AbstractStatusComponents addName (String name) {
            stats.setName(name);
            return this;
        }
        public AbstractStatusComponents addAmount (int amount) throws ObjectAmountException {
            if (amount < 0) {
                throw new ObjectAmountException();
            }
            stats.setAmount(amount);
            return this;
        }
        public AbstractStatusComponents addStatus (String status) {
            stats.setStatus(status);
            return this;
        }
        protected void formText () {
            stats.addText(stats.getAmount());
            stats.addText(stats.getCondition());
            stats.addText(stats.getName());
        }
        public AbstractStats build () {
            formText();
            return stats;
        }
        public AbstractStats defualtBuild () {
            addName("кто-то");
            addStatus("какой-то");
            addAmount(1);
            formText();
            return stats;
        }
    }

}
