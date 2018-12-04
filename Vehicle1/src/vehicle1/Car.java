package vehicle1;

public class Car implements Vehicle1 {

    @Override
    public void move() {
        System.out.println("Move in car");
    }

    @Override
    public void stop() {
        System.out.println("stop in car");
    }
    
}
