package object;

import exeptions.ComplexityException;


public interface ComplexObjBuilder extends ObjBuilder{
    ComplexObjBuilder setObjParts (SimpleObject [] simpleObjects);

    @Override
    Obj build() throws ComplexityException;
}
