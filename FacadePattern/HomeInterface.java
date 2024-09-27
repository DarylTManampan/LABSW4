package FacadePattern;
public class HomeInterface{
    private HomeService airconditioning;
    private HomeService light;
    private HomeService tv;

    public HomeInterface(){
        this.airconditioning = new AirConditioning();
        this.light = new Light();
        this.tv = new TV();
    }

    public void turnOnAll(){
        airconditioning.turnOn();
        light.turnOn();
        tv.turnOn();
    }
    public void turnOffAll(){
        airconditioning.turnOff();
        light.turnOff();
        tv.turnOff();
    }
}