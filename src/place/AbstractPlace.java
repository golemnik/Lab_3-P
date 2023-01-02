package place;

public abstract class AbstractPlace {
    private String place;
    private String text;
    {
        place = "";
        text = "";
    }
    public AbstractPlace () {}

    public void setPlace (String name) {this.place = name;}
    public String getPlace () {return this.place;}
    public void addText (String text) {
        this.text += text + " ";
    }
    public String getText () {return text;}
}
