package newStruct.scene;

import newStruct.object.AbstractObject;

public class Scene {
    AbstractObject actors [];




    public void play () {
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i].text());
        }
    }
}
