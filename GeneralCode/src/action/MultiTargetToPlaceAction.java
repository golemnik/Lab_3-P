//package action;
//
//import object.Obj;
//
//public class MultiTargetToPlaceAction extends AbstractAction implements Action{
//    private Obj[] target;
//    private Obj place;
//    private String preposition;
//
//    public MultiTargetToPlaceAction(Obj [] target, String action, String preposition, Obj place) {
//        this.setAction(action);
//        this.target = target;
//        this.preposition = preposition;
//        this.place = place;
//    }
//
//    public String getTargetStatus () {
//        String status = "";
//        for (int i = 0; i < target.length; i++) {
//            status+=target[i].getFullStatus();
//            if (i != target.length) status += ", ";
//        }
//        return status;
//    }
//
//    // update target!
//    @Override
//    public String act() {
//        return this.getActionName() + " " + this.getTargetStatus() + " " + this.preposition + " " + place.getFullStatus();
//    }
//}
// todo refactor this class