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

    public AbstractPlaceComponents builder () {
        return new AbstractPlaceComponents();
    }

    public class AbstractPlaceComponents {
        AbstractPlace place;

        public AbstractPlaceComponents () {
            place = new GeneralPlace();
        }
        public AbstractPlaceComponents addPlaceName (String placeName) {
            place.setPlace(placeName);
            place.addText(place.getPlace());
            return this;
        }
        public AbstractPlace build () {
            return place;
        }
        public AbstractPlace defaultBuild() {
            addPlaceName("где-то");
            return place;
        }
    }
}
