package action;

public class NonTargetAction extends AbstractAction {
    public NonTargetActionBuilder builder(){
        return new NonTargetActionBuilder();
    }
    public static class NonTargetActionBuilder extends AbstractActionBuilder {
        NonTargetAction obj;
        public NonTargetActionBuilder () {
            obj = new action.NonTargetAction();
        }
        @Override
        public NonTargetActionBuilder addName (String name) {
            obj.setAction(name);
            return this;
        }
        @Override
        protected void formText () {

        }
        @Override
        public NonTargetAction build() {
            return obj;
        }
        @Override
        public NonTargetAction defaultBuild () {
            addName("что-то делает");
            return obj;
        }
    }
}
