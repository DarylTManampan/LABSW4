package FacadePattern;
public class Light implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Light turned On");
    }
    @Override
    public void turnOff(){
        System.out.println("Light turned Off");
    }
}