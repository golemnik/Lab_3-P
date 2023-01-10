//package action;
//
//import exeptions.TargetException;
//import object.AbstractObject;
//import object.SimpleObjectBuilder;
//
//public class MultiTargetAction extends TargetAction {
//    private AbstractObject [] targets;
//    private String preposition;
//    private String union;
//    public MultiTargetAction(String action, String preposition, AbstractObject [] targets, String union) {
//        this.setActionName(action);
//        this.targets = targets;
//        this.preposition = preposition;
//        this.union = union;
//    }
//
//    protected void setTargets (AbstractObject [] targets) {
//        this.targets = targets;
//    }
//    protected AbstractObject[] getTargets () {
//        return targets;
//    }
//
////    public String getTargetStatus () {
////        String status = "";
////        for (int i = 0; i < target.length; i++) {
////            status+=target[i].getFullStatus() + " " + target[i].getFullPlace();
////            if (i+1 < target.length) status += " " + union + " ";
////        }
////        return status;
////    }
////
////    @Override
////    public String act() {
////        return this.getActionName() + " " + this.preposition + " " + this.getTargetStatus();
////    }
//    @Override
//    public MultiTargetActionBuilder builder(){
//        return new MultiTargetActionBuilder();
//    }
//    public static class MultiTargetActionBuilder extends TargetActionBuilder {
//        private final MultiTargetAction obj;
//        public MultiTargetActionBuilder() {
//            obj = new MultiTargetAction();
//        }
//        @Override
//        public MultiTargetActionBuilder addTarget (AbstractObject target) {
//            obj.setTarget(target);
//            // dodelat
//            if (obj.getTargets().length >= 2) {
//                setTargeted(true);
//            }
//            return this;
//        }
//        protected void formText () {
//            obj.addText(obj.getActionName() + " " + obj.getPreposition() + " " + obj.getTarget().getFullStatus());
//        }
//        @Override
//        public MultiTargetAction build () throws TargetException {
//            if (!getTargeted()) {
//                throw new TargetException();
//            }
//            formText();
//            return obj;
//        }
//        @Override
//        public MultiTargetAction defaultBuild () {
//            addName("что-то делает");
//            addPreposition("с");
//            addTarget(new SimpleObjectBuilder().defaultBuild());
//            formText();
//            return obj;
//        }
//    }
//}
