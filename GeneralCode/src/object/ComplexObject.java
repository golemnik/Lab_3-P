package object;

import annotation.GetPublicThings;

@GetPublicThings
public class ComplexObject extends AbstractComplexObject {
    public ComplexObject () {}
    @Override
    public String text () {
        return this.getFullStatus() + " " + getFullParts() + " " + this.getFullPlace() + " " + this.getFullAction();
    }
}
