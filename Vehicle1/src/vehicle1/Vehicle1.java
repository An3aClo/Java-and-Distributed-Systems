package vehicle1;

public interface Vehicle1 {
    public abstract void move();
    public abstract void stop();
 
    public static void main(String[] args) {
        Truck t= new Truck();
        Car c= new Car();
        t.move();
        t.stop();
        c.move();
        c.stop();
    }
    
}
