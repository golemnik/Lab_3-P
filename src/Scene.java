import Props.Actor;
import Props.ComplexActor;

public class Scene {

    String[] order;
    Scene () {
        order = new String[0];
    }

    public void addActorText (Actor newActor) {
        String[] tempOrder = new String [order.length +1];
        for (int i = 0; i < tempOrder.length; i++) {
            if (i < order.length ) tempOrder[i] = order[i];
            else tempOrder [i] = newActor.text();
        }
        order = tempOrder;
    }

    public void addActorText (ComplexActor newActor) {
        String[] tempOrder = new String [order.length +1];
        for (int i = 0; i < tempOrder.length; i++) {
            if (i < order.length ) tempOrder[i] = order[i];
            else tempOrder [i] = newActor.text();
        }
        order = tempOrder;
    }

    public void play () {
        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i] + ".");
        }
    }
}
