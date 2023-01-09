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
        GeneralPlaceBuilder() {
            obj = new GeneralPlace();
        }
        @Override
        public GeneralPlaceBuilder addPlaceName (String name) {
            obj.setPlace(name);
            obj.addText(obj.getPlace());
            return this;
        }
        @Override
        public GeneralPlace build() throws TargetException {
            return obj;
        }

        @Override
        public GeneralPlace defaultBuild () {
            addPlaceName("что-то делает");
            return obj;
        }
    }
}
