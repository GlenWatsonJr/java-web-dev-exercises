package technology;

public class SmartPhone extends Computer{

    private String osVersion;

    public SmartPhone(String amodel, String acpu, int amemory, int astorage, String osVersion){
        super(amodel, acpu, amemory, astorage);
        this.osVersion = osVersion;
    }
}
