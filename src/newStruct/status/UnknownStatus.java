package newStruct.status;

public class UnknownStatus extends AbstractStatus implements Status{

    public UnknownStatus () {
        this.setName("кто-то");
        this.setStatus("какой-то");
    }
    public UnknownStatus (String name) {
        this.setName(name);
        this.setStatus("какой-то");
    }
    @Override
    public String stat() {
        return this.getStatus() + " " + this.getName();
    }
}
