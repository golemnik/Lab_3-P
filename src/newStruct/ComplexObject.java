package newStruct;

import newStruct.SimpleObject;

public class ComplexObject extends SimpleObject {
    SimpleObject parts [];

    ComplexObject (SimpleObject ... parts) {
        this.parts = parts;
    }
}
