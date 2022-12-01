import props.*;
import reason.*;
import status.*;
import action.*;
import position.*;

public class Main {
    public static void main(String[] args) {
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
}