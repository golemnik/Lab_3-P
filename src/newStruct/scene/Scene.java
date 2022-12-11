package newStruct.scene;

import newStruct.object.Obj;

public class Scene {
    Obj actors [];




    public void play () {
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i].text());
        }
    }
}
