package status;

public class GeneralStats extends AbstractStats implements Stats {

    public GeneralStats(String status) {
        this.setName("кто-то");
        this.setStatus(status);
    }
    public GeneralStats(String name, String status) {
        this.setName(name);
        this.setStatus(status);
    }
    @Override
    public String text() {
        return this.getStatus() + " " + this.getName();
    }

}
