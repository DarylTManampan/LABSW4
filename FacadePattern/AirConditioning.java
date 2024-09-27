package FacadePattern;
public class AirConditioning implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Air Conditioner turned On");
    }
    @Override
    public void turnOff(){
        System.out.println("Air Conditioner turned Off");
    }
}