package myfirstthreat;

public class MyFirstThreat {

    public static void main(String[] args) {

        MyTask task1 = new MyTask("name");
        Thread threat1 = new Thread(task1);
        threat1.start();
        
        MyTask task2= new MyTask("hobby");
        Thread thread2= new Thread(task2);
        thread2.start();
        
        MyTask task3= new MyTask("Anything");
        Thread thread3= new Thread(task3);
        thread3.start();
    }

}

class MyTask implements Runnable {

    String value;

    public MyTask(String value) {
        this.value = value;
    }

    public void myName() {
        System.out.println("My name is andrea cloete");
    }

    public void myHobby(){
        System.out.println("My hobby is eating and sleeping");
    }
    @Override
    public void run() {
       //tells threat what to do
       if(value=="name"){
       myName();
       }else if(value=="hobby"){
       myHobby();
       }else{
           System.out.println("Incorrect value");
       }
    }

}
