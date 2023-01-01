package object;


import action.Action;
import action.UnknownAction;
import exeptions.ComplexityExeption;
import place.Place;
import place.UnknownPlace;
import status.Stats;
import status.UnknownStats;

public class ComplexObjectBuilder implements ComplexObjBuilder {
    private final ComplexObject obj;
    boolean complexity;
    public ComplexObjectBuilder () {
        this.obj = new ComplexObject();
        this.complexity = false;
    }
    @Override
    public ComplexObjectBuilder setObjStatus(Stats status){
        obj.setStatus(status);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjPlace(Place place){
        obj.setPlaces(place);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjActions(Action[] action){
        obj.setActions(action);
        return this;
    }
    @Override
    public ComplexObjectBuilder setObjParts (SimpleObject[] parts) {
        obj.setParts(parts);
        this.complexity = true;
        return this;
    }
    @Override
    public ComplexObject defaultBuild () {
        obj.setStatus(new UnknownStats());
        obj.setPlaces(new UnknownPlace());
        obj.setActions(new Action[]{new UnknownAction()});
        obj.setParts(new SimpleObject[]{new SimpleObjectBuilder().defaultBuild()});
        return obj;
    };
    @Override
    public ComplexObject build() throws ComplexityExeption{
        if (!complexity) throw new ComplexityExeption("Attempt to create complex object with zero complexity");
        return obj;
    }
}
