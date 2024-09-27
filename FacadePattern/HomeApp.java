package FacadePattern;
public class HomeApp {
    public static void main(String[] args){
        HomeInterface facade = new HomeInterface();
        System.out.println("\nAll Services Turned On\n");
        facade.turnOnAll();
        System.out.println("\nAll Services Turned Off\n");
        facade.turnOffAll();

    }
}