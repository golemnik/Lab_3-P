package Props;

public abstract class Entity {
    private String name;

    {
        name = "какой-то";
    }
    public Entity (){}
    public Entity (String name) {this.name = name;}

    public String getName () {return name;}
}
