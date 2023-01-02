import action.Action;
import action.UnknownAction;
import object.*;
import place.ObjectPlace;
import status.GeneralStats;
import status.Stats;

public class Main {

    static void newS () {
        scene.Scene scene = new scene.Scene();

        SimpleObject table = new SimpleObjectBuilder()
                .setObjStatus(new GeneralStats().builder().defualtBuild())
                .build();
        ComplexObject plate1 = new ComplexObjectBuilder().defaultBuild();

        ComplexObject plate2 = new ComplexObjectBuilder()
                .setObjParts(new SimpleObject[]{new SimpleObjectBuilder().defaultBuild()})
                .setObjStatus(new GeneralStats().builder().addStatus("пухленький").build())
                .setObjPlace(new ObjectPlace().builder().addRelativeObject(new SimpleObjectBuilder().defaultBuild()).build())
                .setObjActions(new Action[]{new UnknownAction()})
                .build();
        System.out.println(plate1.text());
        System.out.println(plate2.text());
    }
    public static void main(String[] args) {
        newS();
    }
}

// todo 4 генератор случайных названий
// todo 3 генератор случайного объекта
// todo 2 аннотация для генерации случайного объекта
// todo 1 передалать генерацию действия
// todo 1.2 подумать о переносе билдера объектов во вложенный класс

