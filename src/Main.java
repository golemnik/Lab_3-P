import object.*;
import status.UnknownStats;
import status.WholeStats;

public class Main {

    static void newS () {
        scene.Scene scene = new scene.Scene();

        SimpleObject table = new SimpleObjectBuilder()
                .setObjStatus(new UnknownStats(""))
                .build();
        ComplexObject plate1 = new ComplexObjectBuilder().defaultBuild();

        ComplexObject plate2 = new ComplexObjectBuilder()
                .setObjParts(new SimpleObject[]{new SimpleObjectBuilder().defaultBuild()})
                .setObjStatus(new WholeStats().create().addStatus("пухленький").build())
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
// todo 1 передалать генерацию действия и состояния

