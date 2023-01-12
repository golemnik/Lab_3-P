package scene;

import action.Action;
import action.NonTargetAction;
import action.TargetAction;
import action.TargetToPlaceAction;
import object.AbstractObject;
import object.ComplexObject;
import object.SimpleObject;
import object.SimpleObjectBuilder;
import place.GeneralPlace;
import place.Place;
import place.TargetPlace;
import status.GeneralStats;
import status.Stats;

public class RO {
    private AbstractObject object;
    private String g_name = "name";
    private String g_prep = "prepos";
    private String g_status = "status";
    private String g_action = "action";
    private static int n = 1;
    
    public RO() {}

    private int rand(int min, int max) {
        return (int)(Math.random() * max + min);
    }

    public SimpleObject genSimple () {
        return new SimpleObjectBuilder()
                .setObjStatus(rStatus())
                .setObjPlace(rPlace())
                .setObjActions(new Action[]{rAction()})
                .build();
    }
    private Stats rStatus () {
        Stats stat = null;
        switch (rand(0,6)){
            case 0:
                stat = new GeneralStats().builder()
                        .addName(g_name+"_rs"+String.valueOf(n))
                        .addAmount(rand(1,100))
                        .build();
                break;
            case 1:
                stat = new GeneralStats().builder().addName(g_name+"_rs"+String.valueOf(n)).build();
                break;
            case 2:
                stat = new GeneralStats().builder().addStatus(g_status+"_rs"+String.valueOf(n)).build();
                break;
            case 3:
                stat = new GeneralStats().builder().addAmount(rand(1,100)).build();
                break;
            case 4:
                stat = new GeneralStats().builder()
                        .addName(g_name+"_rs"+String.valueOf(n))
                        .addStatus(g_status+"_rs"+String.valueOf(n))
                        .build();
                break;
            case 5:
                stat = new GeneralStats().builder()
                        .addAmount(rand(1,100))
                        .addStatus(g_status+"_rs"+String.valueOf(n))
                        .build();
                break;
            case 6:
                stat = new GeneralStats().builder()
                        .addName(g_name+"_rs"+String.valueOf(n))
                        .addAmount(rand(1,100))
                        .addStatus(g_status+"_rs"+String.valueOf(n))
                        .build();
                break;
        }
        n++;
        return stat;
    }
    private Place rPlace () {
        Place place = null;
        switch (rand(0,1)){
            case 0:
                switch (rand(1,3)){
                    case 1:
                        place = new GeneralPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n)).build();
                        break;
                    case 2:
                        place = new GeneralPlace().builder()
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                        break;
                    case 3:
                        place = new GeneralPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n))
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                        break;
                }
                break;
            case 1:
                switch (rand(0,6)){
                    case 0:
                        place = new TargetPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n))
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                    case 1:
                        place = new TargetPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n)).build();
                        break;
                    case 2:
                        place = new TargetPlace().builder()
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                        break;
                    case 3:
                        place = new TargetPlace().builder()
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 4:
                        place = new TargetPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n))
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 5:
                        place = new TargetPlace().builder()
                                .addPreposition(g_prep+"_rp"+String.valueOf(n))
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 6:
                        place = new TargetPlace().builder()
                                .addPlaceName(g_name+"_rp"+String.valueOf(n))
                                .addPreposition(g_prep+"_rp"+String.valueOf(n))
                                .addRelativeObject(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                }
                break;
        }
        n++;
        return place;
    }
    private Action rAction () {
        Action action = null;
        String pfx = "_ra" + n;
        switch (rand(1,3)){
            case 1: //nontarget
                switch (rand(0,1)) {
                    case 0:
                        action = new NonTargetAction().builder()
                                .build();
                        break;
                    case 1:
                        action = new NonTargetAction().builder()
                                .addName(g_name+"_ra"+String.valueOf(n))
                                .build();
                        break;
                }
                break;
            case 2: //target
                switch (rand(0,3)){
                    case 0:
                        action = new TargetAction().builder()
                                .addTarget(new SimpleObjectBuilder().defaultBuild())
                                .addName(g_name+"_rp"+String.valueOf(n))
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                    case 1:
                        action = new TargetAction().builder()
                                .addTarget(new SimpleObjectBuilder().defaultBuild())
                                .addName(g_name+"_rp"+String.valueOf(n)).build();
                        break;
                    case 2:
                        action = new TargetAction().builder()
                                .addTarget(new SimpleObjectBuilder().defaultBuild())
                                .addPreposition(g_prep+"_rp"+String.valueOf(n)).build();
                        break;
                    case 3:
                        action = new TargetAction().builder()
                                .addTarget(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                }
                break;
            case 3: //
                switch (rand(0,6)){
                    case 0:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addName(g_name+pfx)
                                .addPreposition(g_prep+pfx).build();
                    case 1:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addName(g_name+pfx).build();
                        break;
                    case 2:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addPreposition(g_prep+pfx).build();
                        break;
                    case 3:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addTarget(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 4:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addName(g_name+pfx)
                                .addTarget(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 5:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addPreposition(g_prep+pfx)
                                .addTarget(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                    case 6:
                        action = new TargetToPlaceAction().builder()
                                .addTargetPlace(rPlace())
                                .addName(g_name+pfx)
                                .addPreposition(g_prep+pfx)
                                .addTarget(new SimpleObjectBuilder().defaultBuild()).build();
                        break;
                }
                break;
            case 4:

                break;
            case 5:

                break;
        }
        n++;
        return action;
    }



    private void type () {
        if (rand(1,2)==1){
            object = new SimpleObject();
        }
        else {
            object = new ComplexObject();
        }
    }
    private void params () {
    }
}
