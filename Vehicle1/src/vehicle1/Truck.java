package vehicle1;

public class Truck implements Vehicle1{

    @Override
    public void move() {
        System.out.println("Move in truck");
    }

    @Override
    public void stop() {
        System.out.println("Stop in truck");
    }
    
}
