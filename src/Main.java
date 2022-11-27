import Props.Actor;
import action.GeneralAction;
import action.TargetAction;

public class Main {
    public static void main(String[] args) {

        Actor a = new Actor("бяка");
        Actor b = new Actor("бука");
        a.addAction(new TargetAction(b ,"в"));
        System.out.println(a.text());
    }
}