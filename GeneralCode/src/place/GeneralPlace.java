package place;

import exeptions.TargetException;

public class GeneralPlace extends AbstractPlace{
    @Override
    public String text() {
        return getText();
    }

    public GeneralPlaceBuilder builder () {
        return new GeneralPlaceBuilder();
    }

    public static class GeneralPlaceBuilder extends AbstractPlaceBuilder {
        private final GeneralPlace obj;
        public GeneralPlaceBuilder() {
            obj = new GeneralPlace();
        }
        @Override
        public GeneralPlaceBuilder addPlaceName (String name) {
            obj.setPlaceName(name);
            return this;
        }

        @Override
        public AbstractPlaceBuilder addPreposition(String preposition) {
            obj.setPreposition(preposition);
            return this;
        }

        @Override
        protected void formText() {
            obj.addText(obj.getPreposition() + " " + obj.getPlaceName());
        }
        @Override
        public GeneralPlace build() throws TargetException {
            formText();
            return obj;
        }

        @Override
        public GeneralPlace defaultBuild () {
            addPlaceName("где-то");
            addPreposition("");
            formText();
            return obj;
        }
    }
}
