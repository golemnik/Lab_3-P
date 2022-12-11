package newStruct.place;

public class GeneralPlace extends AbstractPlace implements Place{
    public GeneralPlace (String place) {
        this.setPlace(place);
    }
    @Override
    public String loc() {
        return getPlace();
    }
}
