import action.Action;
import action.TargetAction;
import action.NonTargetAction;
import exeptions.ObjectAmountException;
import object.*;
import place.TargetPlace;
import status.GeneralStats;

public class Main {
    static void newS () throws ObjectAmountException {
        scene.Scene scene = new scene.Scene();

        SimpleObject table = new SimpleObjectBuilder()
                .setObjStatus(new GeneralStats().builder().defualtBuild())
                .build();
        ComplexObject plate1 = new ComplexObjectBuilder().defaultBuild();

        ComplexObject plate2 = new ComplexObjectBuilder()
                .setObjParts(new SimpleObject[]{new SimpleObjectBuilder().defaultBuild()})
                .setObjStatus(new GeneralStats().builder()
                                .addAmount(0)
                                .build())
                .setObjPlace(new TargetPlace().builder()
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild())
                                .addPlaceName("где-то")
                                .build())
                .setObjActions(new Action[]{
                        new NonTargetAction().builder()
                                .defaultBuild(),
                        new TargetAction().builder()
                                .addTarget(plate1)
                                .addName("что-то делает")
                                .addPreposition("с")
                                .build()})
                .build();

        System.out.println(plate1.text());
        System.out.println(plate2.text());
    }
    public static void main(String[] args) {


        newS();
    }
}

// todo доделать вывод позиции относительно объекта!

// todo 4 генератор случайных названий
// todo 3 генератор случайного объекта
// todo 2 аннотация для генерации случайного объекта
// todo 1 передалать генерацию действия
// todo 1.2 подумать о переносе билдера объектов во вложенный класс

//todo пофиксить статус сделав абстрактный класс лишь определяющим функционал и перенести реалезацию в generalstats

