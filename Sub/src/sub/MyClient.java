package sub;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {

    public static void main(String[] args) {
        try {
            Registry r= LocateRegistry.getRegistry("localhost", 1090);
            Sub s=(Sub)r.lookup("Andrea");
            System.out.println("Multiplication: "+s.mult(12, 12));
            System.out.println("Sustruction: "+s.substract(10,5));

        } catch (Exception e) {
            System.out.println("The error"+e);
        }
    }
}
