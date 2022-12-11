package oldStruct;

import oldStruct.props.Actor;
import oldStruct.props.ComplexActor;

import java.util.Arrays;

public class Scene {

    String[] order;
    public Scene () {
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

    @Override
    public int hashCode() {
        return Arrays.hashCode(order);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scene scene)) return false;
        return Arrays.equals(order, scene.order);
    }

    @Override
    public String toString() {
        return "oldStruct.Scene{" +
                "order=" + Arrays.toString(order) +
                '}';
    }
}
