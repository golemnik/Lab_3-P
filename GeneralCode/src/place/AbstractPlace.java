package place;

public abstract class AbstractPlace implements Place {
    private String placeName;
    private String text;
    {
        placeName = "где-то";
        text = "";
    }
    public AbstractPlace () {}

    protected void setPlaceName(String name) {this.placeName = name;}
    protected String getPlaceName() {return this.placeName;}
    protected void addText (String text) {
        this.text += text + " ";
    }
    protected String getText () {return text;}

    public abstract AbstractPlaceBuilder builder ();

    public abstract static class AbstractPlaceBuilder {
        public AbstractPlaceBuilder() {}
        public abstract AbstractPlaceBuilder addPlaceName (String placeName);
        protected abstract void formText ();
        public abstract AbstractPlace build ();
        public abstract AbstractPlace defaultBuild();
    }
}
