package newStruct.place;

public class UnknownPlace extends AbstractPlace implements Place{
    @Override
    public String loc() {
        return "где-то";
    }
}
