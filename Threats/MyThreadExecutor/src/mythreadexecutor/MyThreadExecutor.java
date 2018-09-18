package mythreadexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadExecutor {

    public static void main(String[] args) {

        ExecutorService e = Executors.newCachedThreadPool();

        MyTask t = new MyTask();
        e.execute(t);

    }

}

class MyTask implements Runnable {

    public MyTask() {

    }

    @Override
    public void run() {
        System.out.println("Hi there");
    }

}
