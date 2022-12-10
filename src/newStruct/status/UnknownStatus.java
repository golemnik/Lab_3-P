package newStruct.status;

public class UnknownStatus extends AbstractStatus implements Status{

    public UnknownStatus () {
        this.setName("какой-то");
    }
    @Override
    public String stat() {
        return this.getName();
    }
}
