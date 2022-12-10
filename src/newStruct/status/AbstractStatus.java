package newStruct.status;

import java.security.PublicKey;

public abstract class AbstractStatus {
    private String name;
    public AbstractStatus () {}

    public void setName (String name) {this.name = name;}
    public String getName () {return this.name;}

}
