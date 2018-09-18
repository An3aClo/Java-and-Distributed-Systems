package mymultithreating;

import java.util.Random;

public class MyMultithreating {

    public static void main(String[] args) {
        MyClass c = new MyClass();
        Thread t = new Thread(c);
        t.start();
    }
}

class MyClass implements Runnable {

    Random r = new Random();
    public int sleepTime=0;

    public String taskName = "Andrea";

    public MyClass() {

    }

    @Override
    public void run() {
        if(sleepTime%4==0){
            sleepTime = r.nextInt(5);
        }
        System.out.println("The sleeping time is: " + sleepTime + "The task name is: " + taskName);
    }
}
