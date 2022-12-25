package object;

public class SimpleObject extends AbstractObject {
    @Override
    public String text () {
        return this.getFullStatus() + " " + this.getFullPlace() + " " + this.getFullAction();
    }
}
