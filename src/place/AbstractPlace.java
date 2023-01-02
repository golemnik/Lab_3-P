package place;

public abstract class AbstractPlace implements Place {
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

    public AbstractPlaceComponents builder () {
        return new AbstractPlaceComponents();
    }

    public class AbstractPlaceComponents {
        AbstractPlace place;

        public AbstractPlaceComponents () {
            place = new TargetPlace();
        }
        public AbstractPlaceComponents addPlaceName (String placeName) {
            place.setPlace(placeName);
            place.addText(place.getPlace());
            return this;
        }
        public AbstractPlace build () {
            return place;
        }
        public AbstractPlace defualtBuild () {
            place.setPlace("где-то");
            place.addText(place.getPlace());
            return place;
        }
    }
}
