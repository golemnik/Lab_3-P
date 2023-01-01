package status;

public class UnknownStats extends AbstractStats implements Stats {

    public UnknownStats() {
        this.setName("кто-то");
        this.setStatus("какой-то");
    }
    public UnknownStats(String name) {
        this.setName(name);
        this.setStatus("какой-то");
    }
    @Override
    public String text() {
        return this.getStatus() + " " + this.getName();
    }
}
