package place;

import object.AbstractObject;

public class TargetPlace extends AbstractPlace{

    AbstractObject object;
    public TargetPlace() {
    }
    private void setRelativeObject (AbstractObject relativeObject) {
        object = relativeObject;
    }

    @Override
    public String text() {
        return getText();
    }

    @Override
    public PlaceComponents builder() {
        return new PlaceComponents();
    }

    public class PlaceComponents extends AbstractPlaceComponents{
        public PlaceComponents addRelativeObject (AbstractObject relativeObject) {
            setRelativeObject(relativeObject);
            addText("около" + relativeObject.getFullStatus());
            System.out.println("rel");
            return this;
        }

        @Override
        public AbstractPlace build() {
            return super.build();
        }
    }


}
