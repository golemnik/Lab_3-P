package scene;

import object.Obj;

public class Scene {
    Obj[] order;

    public void addActorText (Obj object) {
        Obj[] tempOrder = new Obj [order.length +1];
        for (int i = 0; i < tempOrder.length; i++) {
            if (i < order.length ) tempOrder[i] = order[i];
            else tempOrder [i] = object;
        }
        order = tempOrder;
    }
    public void addActorText (Obj [] order) {
        this.order = order;
    }
    public void play () {
        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i].text());
        }
    }
}
