package place;

public class UnknownPlace extends AbstractPlace implements Place{
    public UnknownPlace () {
        this.setPlace("где-то");
    }
    @Override
    public String loc() {
        return this.getPlace();
    }
}
