package status;

import annotation.GetName;
import annotation.GetPublicThings;
import exeptions.ObjectAmountException;

@GetName
@GetPublicThings
public class GeneralStats extends AbstractStats {
    @GetName
    @Override
    public String text() {
        return this.getText();
    }
    public GeneralStatsBuilder builder () {
        return new GeneralStatsBuilder();
    };

    public class GeneralStatsBuilder extends AbstractStatusBuilder {
        private final GeneralStats stats;
        public GeneralStatsBuilder() {
            stats = new GeneralStats();
        }
        public GeneralStatsBuilder addName (String name) {
            stats.setName(name);
            return this;
        }
        public GeneralStatsBuilder addAmount (int amount) throws ObjectAmountException {
            try {
                if (amount <= 0) {
                    throw new ObjectAmountException(amount);
                }
            }
            catch (ObjectAmountException exception) {
                throw exception;
            }
            stats.setAmount(amount);
            return this;
        }
        public GeneralStatsBuilder addStatus (String status) {
            stats.setStatus(status);
            return this;
        }
        protected void formText () {
            stats.addText(stats.getStrAmount());
            stats.addText(stats.getCondition());
            stats.addText(stats.getName());
        }
        public GeneralStats build () {
            formText();
            return stats;
        }
        public GeneralStats defualtBuild () {
            addName("кто-то");
            addStatus("какой-то");
            addAmount(1);
            formText();
            return stats;
        }
    }

}
