package multithreading;

//import static java.lang.Thread.interrupted;

public class ByImp implements Runnable {
    public void run(){
//        System.out.println(Thread.interrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread " + Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
