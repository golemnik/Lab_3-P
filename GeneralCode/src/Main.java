import action.Action;
import action.TargetAction;
import action.NonTargetAction;
import action.TargetToPlaceAction;
import annotation.GetPublicThings;
import exeptions.ObjectAmountException;
import object.*;
import place.GeneralPlace;
import place.TargetPlace;
import status.GeneralStats;

@GetPublicThings
public class Main {
    static void newS () throws ObjectAmountException {
        scene.Scene scene = new scene.Scene();

        SimpleObject table = new SimpleObjectBuilder()
                .setObjStatus(new GeneralStats().builder().defualtBuild())
                .build();
        ComplexObject plate1 = new ComplexObjectBuilder().defaultBuild();

        System.out.println(plate1.text());

        ComplexObject plate2 = new ComplexObjectBuilder()
                .setObjParts(new SimpleObject[]{new SimpleObjectBuilder().defaultBuild()})
                .setObjStatus(new GeneralStats().builder()
                                .addAmount(22)
                                .build())
                .setObjPlace(new TargetPlace().builder()
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild())
                                .addPlaceName("где-то")
                                .build())
                .setObjActions(new Action[]{
                        new NonTargetAction().builder()
                                .defaultBuild(),
                        new TargetToPlaceAction().builder()
                                .addTarget(plate1)
                                .addTargetPlace(new GeneralPlace().builder()
                                        .addPreposition("")
                                        .addPlaceName("луна")
                                        .build())
                                .addName("отправляет")
                                .addPreposition("на")
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

