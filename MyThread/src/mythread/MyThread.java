package mythread;

public class MyThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Work("t1"));
        t1.start();
        
//        Thread t2 = new Thread(new Work("t22"));
//        t2.start();
    }

}

class Work implements Runnable{    
    
    String name;
    
    public Work(String name){
        this.name = name;
    }
    
    public void triangle(int base, int height){
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    
    public void rectangle(int length, int width){
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    
    public void circle(int radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    
    public void printTriangle(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Override
    public void run() {
        if ("t1".equals(name)) {
            triangle(4, 5);
            printTriangle(6);            
        } else {
            circle(3);
            rectangle(7, 3);            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}