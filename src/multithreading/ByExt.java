package multithreading;

public class ByExt extends Thread {
    public void run() {
            System.out.println("thread " + Thread.currentThread().getName());
        }
}

