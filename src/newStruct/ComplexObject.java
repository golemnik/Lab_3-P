package newStruct;

import newStruct.SimpleObject;

public class ComplexObject extends SimpleObject {
    SimpleObject parts [];

    public ComplexObject () {

    }
    void setParts (SimpleObject [] parts) {
        this.parts = parts;
    }
    @Override
    public String text () {
        return "Compl obj";
    }
}
