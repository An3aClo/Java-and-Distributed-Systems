package vehicle;

public class Truck extends Vehicle {

    @Override
    public void move() {
        System.out.println("Im the move method in the truck class");
    }

    @Override
    public void stop() {
        System.out.println("Im the stop method in the truk method");
    }
    
}
