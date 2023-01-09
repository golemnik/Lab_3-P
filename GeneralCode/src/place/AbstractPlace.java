package place;

public abstract class AbstractPlace implements Place {
    private String place;
    private String text;
    {
        place = "";
        text = "";
    }
    public AbstractPlace () {}

    protected void setPlace (String name) {this.place = name;}
    protected String getPlace () {return this.place;}
    protected void addText (String text) {
        this.text += text + " ";
    }
    protected String getText () {return text;}

    public abstract AbstractPlaceBuilder builder ();

    public abstract static class AbstractPlaceBuilder {
        public AbstractPlaceBuilder() {}
        public abstract AbstractPlaceBuilder addPlaceName (String placeName);
        public abstract AbstractPlace build ();
        public abstract AbstractPlace defaultBuild();
    }
}
