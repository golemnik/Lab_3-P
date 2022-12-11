package newStruct.status;

public abstract class AbstractStatus {
    private String status;
    private String name;
    private int influence;
    public AbstractStatus () {}

    public void setStatus (String status) {this.status = status;}
    public String getStatus () {return this.status;}
    public void setName (String name) {this.name = name;}
    public String getName () {return this.name;}
    public void setInfluence (int influence) {this.influence = influence;}
    public int getInfluence () {return this.influence;}
}
