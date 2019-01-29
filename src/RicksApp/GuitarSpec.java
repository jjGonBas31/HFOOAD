package RicksApp;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;

    public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }

    public boolean matches(GuitarSpec otherSpec){
        if (builder != otherSpec.getBuilder())
            return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel().toLowerCase())))
            return false;
        if (numString != otherSpec.getNumString())
            return false;
        if (type != otherSpec.getType())
            return false;
        if (backWood != otherSpec.getBackWood())
            return false;
        if (topWood != otherSpec.getTopWood())
            return false;
        return true;
    }
}
