package multithreading;

public class ByExt extends Thread {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++) {
            ByExt ob = new ByExt();
            ob.start();
        }
    }
    public void run() {
        try {
            System.out.println("thread " + Thread.currentThread().threadId());
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

