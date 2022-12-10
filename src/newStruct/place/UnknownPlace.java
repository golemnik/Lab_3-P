package newStruct.place;

public class UnknownPlace extends AbstractPlace implements Place{
    public UnknownPlace () {
        this.setName("где-то");
    }
    @Override
    public String loc() {
        return this.getName();
    }
}
