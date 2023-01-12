package place;

public abstract class AbstractPlace implements Place {
    private String placeName;
    private String preposition;
    private String text;
    {
        placeName = "";
        preposition = "";
        text = "";
    }
    public AbstractPlace () {}

    protected void setPlaceName(String name) {this.placeName = name;}
    protected String getPlaceName() {return this.placeName;}
    protected void setPreposition(String preposition) {
        this.preposition = preposition;
    }
    protected String getPreposition () {
        return this.preposition;
    }
    protected void addText (String text) {
        this.text += text + " ";
    }
    protected String getText () {return text;}

    public abstract AbstractPlaceBuilder builder ();

    public abstract static class AbstractPlaceBuilder {
        public AbstractPlaceBuilder() {}
        public abstract AbstractPlaceBuilder addPlaceName (String placeName);

        public abstract AbstractPlaceBuilder addPreposition (String preposition);
        protected abstract void formText ();
        public abstract AbstractPlace build ();
        public abstract AbstractPlace defaultBuild();
    }
}
