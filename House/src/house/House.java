//abstract class
package house;

public abstract class House {

    public abstract void dust();

    public abstract void clean();

    public void run() {
        System.out.println("We are running");
    }//methods can onluy be executed in abstract classes and not in intefaces

    public static void main(String[] args) {
    //House h = new House(); You can not mak an object out of an absratct calss
    Hut h= new Hut();
    h.run();
    }

}
