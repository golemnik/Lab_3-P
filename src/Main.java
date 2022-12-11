import newStruct.action.TargetToPlaceAction;
import newStruct.object.*;
import newStruct.place.GeneralPlace;
import newStruct.place.Place;
import newStruct.place.RelativePlace;
import newStruct.status.UnknownStatus;
import oldStruct.Scene;
import oldStruct.props.*;
import oldStruct.props.Actor;
import oldStruct.reason.*;
import oldStruct.status.*;
import oldStruct.action.*;
import oldStruct.position.*;

public class Main {
    static void oldS () {
        Scene scene = new Scene();

        Actor she = new Actor("Она");
        Actor table = new Actor("стол");
        Actor plate = new Actor("тарелка");
        Actor cup = new Actor("чашка");
        Actor flower = new Actor("цветок");
        ComplexActor flowerPack = new ComplexActor("букет", flower);
        Actor cake = new Actor("кекс");
        Actor plita = new Actor("плита");
        Actor filifioka = new Actor("Филифьонка");
        Actor clocks = new Actor("часы");
        Actor leaf = new Actor("лист");
        ComplexActor girlianda = new ComplexActor("гирлянда", leaf);
        Actor door = new Actor("дверь");
        Actor sebia = new Actor("себя");
        Actor mirror = new Actor("зеркало");
        Actor arms = new Actor("рука");
        Actor kolpachok = new Actor("колпачок");
        Actor lob = new Actor("лоб");
        Actor kolokolchik = new Actor("колоколчик");
        Actor slezi = new Actor("слеза");

        she.addAction(new ObjToTargetAction("поставить", table, "на", new Actor[] {plate, cup, flowerPack}));
        scene.addActorText(she);
        cake.addAction(new TargetAction("стоять", "на", plita));
        cake.addStatus(new GeneralStatus("почерневший", new GeneralReason("ожидание", "от")));
        scene.addActorText(cake);
        girlianda.addPosition(new RelativePosition(door,"над"));
        clocks.addPosition(new RelativePosition(door, "над"));
        mirror.addAction(new TargetAction("отражать", sebia));
        arms.addAmount(2);
        filifioka.addAction(new Action[]{
                new TargetAction("взглянуть", "на", new Entity[] {clocks, girlianda}),
                new TargetAction("посмотреть", "на", mirror),
                new ObjToTargetAction("опереться", table,"о" , arms),
                new GeneralAction("заплакать")});
        scene.addActorText(filifioka);
        lob.addPosition(new RelativePosition (filifioka, "принадлежать"));
        kolokolchik.addAction(new TargetAction("съехать", "на", lob));
        scene.addActorText(kolokolchik);

        scene.play();
    }

    static void newS () {
        SimpleObjectDirector manager = new SimpleObjectDirector();
        SimpleObjectBuilder builder = new SimpleObjectBuilder();
        manager.createObj(builder,
                new UnknownStatus("биба"));
        SimpleObject biba = builder.getObj();

        manager.createObj(builder,
                new UnknownStatus("боба"),
                new newStruct.action.Action[]{new newStruct.action.TargetAction("стоять", "рядом с", biba)});
        SimpleObject boba = builder.getObj();

        //biba.setPlaces(new Place[]{new RelativePlace("около", boba)});
        GeneralPlace gpl = new GeneralPlace("комната");
        biba.setActions(new newStruct.action.Action[]{new TargetToPlaceAction(boba, "поставить", "в", gpl)});
        System.out.println(boba.text());
        System.out.println(biba.text());

        ComplexObjectDirector c_manager = new ComplexObjectDirector();
        ComplexObjectBuilder c_builder = new ComplexObjectBuilder();
        c_manager.createObj(c_builder,
                new SimpleObject[]{biba, boba},
                new UnknownStatus("бобиба"));
        ComplexObject bobiba = c_builder.getObj();

        System.out.println(bobiba.text());


    }
    public static void main(String[] args) {
        //newS();
        oldS();
    }
}