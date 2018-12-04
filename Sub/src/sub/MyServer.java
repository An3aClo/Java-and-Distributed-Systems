package sub;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {

    public static void main(String[] args) {

       try{
       //Register services
       Registry r=LocateRegistry.createRegistry(1090);
       //get methds
       Implementation i= new Implementation();//the implementation of this class is the service
       r.rebind("Andrea",i); // Andrea is the name of the service
       
       }catch(Exception e){
          System.out.println("The error"+e);
       }
    }
}
