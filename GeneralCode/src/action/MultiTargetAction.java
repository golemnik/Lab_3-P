//package action;
//
//import exeptions.TargetException;
//import object.AbstractObject;
//import object.SimpleObjectBuilder;
//
//public class MultiTargetAction extends TargetAction {
//    private AbstractObject [] target;
//    private String preposition;
//    private String union;
//    public MultiTargetAction(String action, String preposition, AbstractObject [] target, String union) {
//        this.setAction(action);
//        this.target = target;
//        this.preposition = preposition;
//        this.union = union;
//    }
//    public String getTargetStatus () {
//        String status = "";
//        for (int i = 0; i < target.length; i++) {
//            status+=target[i].getFullStatus() + " " + target[i].getFullPlace();
//            if (i+1 < target.length) status += " " + union + " ";
//        }
//        return status;
//    }
//
//    @Override
//    public String act() {
//        return this.getActionName() + " " + this.preposition + " " + this.getTargetStatus();
//    }
//    @Override
//    public MultiTargetActionBuilder builder(){
//        return new MultiTargetActionBuilder();
//    }
//    public static class MultiTargetActionBuilder extends TargetActionBuilder {
//        private final TargetAction obj;
//        private boolean targeted = false;
//        public TargetActionBuilder() {
//            obj = new TargetAction();
//        }
//        protected void setTargeted (boolean targeted) {
//            this.targeted = targeted;
//        }
//        protected boolean getTargeted () {
//            return this.targeted;
//        }
//        @Override
//        public TargetAction.TargetActionBuilder addName (String name) {
//            obj.setAction(name);
//            return this;
//        }
//        public TargetAction.TargetActionBuilder addPreposition (String preposition) {
//            obj.setPreposition(preposition);
//            return this;
//        }
//        public TargetAction.TargetActionBuilder addTarget (AbstractObject target) {
//            obj.setTarget(target);
//            targeted = true;
//            return this;
//        }
//        protected void formText () {
//            obj.addText(obj.getActionName() + " " + obj.getPreposition() + " " + obj.getTarget().getFullStatus());
//        }
//        @Override
//        public TargetAction build () throws TargetException {
//            if (!getTargeted()) {
//                throw new TargetException();
//            }
//            formText();
//            return obj;
//        }
//        @Override
//        public TargetAction defaultBuild () {
//            addName("что-то делает");
//            addPreposition("с");
//            addTarget(new SimpleObjectBuilder().defaultBuild());
//            formText();
//            return obj;
//        }
//    }
//}
