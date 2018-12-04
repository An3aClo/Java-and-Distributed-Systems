package mythread1;

public class MyThread1 {

    public static void main(String[] args) {
        Work1 w1 = new Work1("w1");
        w1.start();
        Work1 w2 = new Work1("w2");
        w2.start();
    }

}

class Work1 extends Thread {

    String name;

    public Work1(String name) {
        this.name = name;
    }

    //synchronized: lookup how to use and implement correctly
    public synchronized void printNumbers() {
        int count = 0;
        for (int i = 300; i <= 900; i++) {
            if (count == 20) {
                System.out.println("");
                count = 0;
            }
            if (i % 3 != 0 && i % 4 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
    }

    public synchronized void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Override
    public void run() {
        if ("w1".equals(name)) {
            printNumbers();
        } else {
            printTriangle();
        }
    }
}
