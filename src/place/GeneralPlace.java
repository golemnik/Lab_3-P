package place;

public class GeneralPlace extends AbstractPlace{
    @Override
    public String text() {
        System.out.print("general trigger: ");
        return getText();
    }
}
