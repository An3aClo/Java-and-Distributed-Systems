package vehicle;

public abstract class Vehicle {

    public String color;

    public abstract void move();

    public abstract void stop();

    
    public static void main(String[] args) {
        Truck t=new Truck();
        t.move();
        t.stop();
        Car c= new Car();
        c.move();
        c.stop();
    }

}
