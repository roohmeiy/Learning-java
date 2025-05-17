package multithreading;

public class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ThreadLifeCycle t = new ThreadLifeCycle(); // NEW
        System.out.println("State after creation: " + t.getState());

        t.start(); // RUNNABLE
        System.out.println("State after start(): " + t.getState());

        try {
            Thread.sleep(100); // Give it time to finish
        } catch (InterruptedException e) {}

        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
