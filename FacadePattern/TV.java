package FacadePattern;
public class TV implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("TV turned On");
    }
    @Override
    public void turnOff(){
        System.out.println("TV turned Off");
    }
}