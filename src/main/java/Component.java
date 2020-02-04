public abstract class Component {

    private int volumeLevel;
    private boolean powerOn;
    private String make;
    private String module;



    public Component(String make, String module) {
        this.make = make;
        this.module = module;
        this.volumeLevel = 5;
        this.powerOn = false;
    }

    public void volumeUp(){
        this.volumeLevel += 1;
    }
    public void volumeDown(){
        this.volumeLevel -= 1;
    }
    public void powerOn(){
        this.powerOn = true;

    }
    public void powerOff(){
        this.powerOn = false;
    }
    public String getMake() {
        return make;
    }

    public String getModule() {
        return module;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isPowerOn() {
        return powerOn;
    }


}
