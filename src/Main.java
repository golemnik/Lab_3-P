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
        newStruct.scene.Scene scene = new newStruct.scene.Scene();
        SimpleObjectDirector sManager = new SimpleObjectDirector();
        SimpleObjectBuilder sBuilder = new SimpleObjectBuilder();
        ComplexObjectDirector cManager = new ComplexObjectDirector();
        ComplexObjectBuilder cBuilder = new ComplexObjectBuilder();

        sManager.createObj(sBuilder, new UnknownStatus("стол")); SimpleObject table = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("тарелка")); SimpleObject plate = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("чашка")); SimpleObject cup = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("цветок")); SimpleObject flower = sBuilder.getObj();
        cManager.createObj(cBuilder, new SimpleObject[] {flower}, new newStruct.status.UnknownStatus(("букет"))); ComplexObject flowerPack = cBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("кекс")); SimpleObject cake = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("плита")); SimpleObject plita = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("Филифьонка")); SimpleObject filifioka = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("часы")); SimpleObject clocks = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("лист")); SimpleObject leaf = sBuilder.getObj();
        cManager.createObj(cBuilder, new SimpleObject[] {leaf}, new newStruct.status.UnknownStatus("гирлянда")); ComplexObject girlianda = cBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("дверь")); SimpleObject door = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("зеркало")); SimpleObject mirror = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("рука")); SimpleObject arms = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("колпачок")); SimpleObject kolpachok = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("лоб")); SimpleObject lob = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("колоколчик")); SimpleObject kolokolchik = sBuilder.getObj();
        sManager.createObj(sBuilder, new UnknownStatus("слеза")); SimpleObject slezi = sBuilder.getObj();

        scene.addActorText(new Obj[]{table, plate, cup, flowerPack, cake,
                plita, filifioka, clocks, girlianda, door, mirror, arms,
                kolpachok, lob, kolokolchik, slezi});

        scene.play();
    }
    public static void main(String[] args) {
        newS();
        //oldS();
    }
}