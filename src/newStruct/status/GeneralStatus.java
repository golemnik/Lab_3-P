package newStruct.status;

public class GeneralStatus extends AbstractStatus implements Status{

    public GeneralStatus (String status) {
        this.setName("кто-то");
        this.setStatus(status);
    }
    public GeneralStatus (String name, String status) {
        this.setName(name);
        this.setStatus(status);
    }
    @Override
    public String stat() {
        return this.getStatus() + " " + this.getName();
    }
}
