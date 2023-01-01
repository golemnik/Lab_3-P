package status;

public class WholeStats extends AbstractStats implements Stats{
    @Override
    public String text() {
        return this.getText();
    }
    public StatusComponents create () {
        return new StatusComponents();
    }

    public static class StatusComponents {
        private final WholeStats stats;
        public StatusComponents () {
            stats = new WholeStats();
        }
        public StatusComponents addName (String name) {
            stats.setName(name);
            stats.addText(stats.getName());
            return this;
        }
        public StatusComponents addAmount (int amount) {
            stats.setAmount(amount);
            stats.addText(stats.getAmount());
            return this;
        }
        public StatusComponents addStatus (String status) {
            stats.setStatus(status);
            stats.addText(stats.getStatus());
            return this;
        }
        public WholeStats build () {
            return stats;
        }
        public WholeStats defualtBuild () {
            stats.setName("кто-то");
            stats.addText(stats.getName());
            stats.setStatus("какой-то");
            stats.addText(stats.getStatus());
            return stats;
        }
    }


}
