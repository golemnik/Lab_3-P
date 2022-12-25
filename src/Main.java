import object.*;
import status.UnknownStatus;

public class Main {

    static void newS () {
        scene.Scene scene = new scene.Scene();

        SimpleObject table = new SimpleObjectBuilder()
                .setObjStatus(new UnknownStatus(""))
                .build();

        ComplexObject plate1 = new ComplexObjectBuilder()
                .setObjStatus(new UnknownStatus())
                .build();

        ComplexObject plate2 = new ComplexObjectBuilder()
                .setObjParts(new SimpleObject[]{table})
                .setObjStatus(new UnknownStatus())
                .build();

    }
    public static void main(String[] args) {
        newS();
        //oldS();
    }
}