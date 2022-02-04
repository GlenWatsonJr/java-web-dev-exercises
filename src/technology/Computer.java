package technology;

public class Computer {

    private int id;
    private static int nextId = 1;
    private String model;
    private String manufacturer;
    private String cpu;
    private int memory;
    private int storage;

    public Computer(){
        this.id = nextId;
        this.nextId++;
    }
    public Computer(String model, String cpu, int memory, int storage){
        this();
        this.model = model;
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public boolean runsMinecraft(){
        if ((this.memory > 4) && (this.storage > 128)){
            return true;
        }else return false;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Computer.nextId = nextId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
