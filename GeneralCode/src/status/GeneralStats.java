package status;

import annotation.GetName;
import annotation.GetPublicThings;
@GetName
@GetPublicThings
public class GeneralStats extends AbstractStats {
    @GetName
    @Override
    public String text() {
        return this.getText();
    }

}
