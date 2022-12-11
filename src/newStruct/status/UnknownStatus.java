package newStruct.status;

public class UnknownStatus extends AbstractStatus implements Status{

    public UnknownStatus () {
        this.setStatus("какой-то");
    }
    @Override
    public String stat() {
        return this.getStatus();
    }
}
