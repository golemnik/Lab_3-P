package status;

public abstract class AbstractStats {
    private String text;
    private String status;
    private String name;
    private int amount;
    {
        text = "";
        status = "";
        name = "";
        amount = 1;
    }
    public AbstractStats() {}

    public void setStatus (String status) {this.status = status;}
    public String getStatus () {return this.status;}
    public void setName (String name) {this.name = name;}
    public String getName () {return this.name;}
    public void addText (String text) {
        this.text += text;
    }
    public String getText () {return text;}

    public void setAmount (int amount) {this.amount = amount;}
    public String getAmount () {
        return String.valueOf(amount);
    }

}
