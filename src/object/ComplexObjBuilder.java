package object;

import exeptions.ComplexityExeption;


public interface ComplexObjBuilder extends ObjBuilder{
    ComplexObjBuilder setObjParts (SimpleObject [] simpleObjects);

    @Override
    Obj build() throws ComplexityExeption;
}
