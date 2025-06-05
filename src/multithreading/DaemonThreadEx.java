package multithreading;

public class DaemonThreadEx extends Thread{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I'm main character");

        DaemonThreadEx dt= new DaemonThreadEx();
        DaemonThreadEx dt1= new DaemonThreadEx();
        DaemonThreadEx dt2= new DaemonThreadEx();
        DaemonThreadEx dt3= new DaemonThreadEx();
        dt.setDaemon(true);
        dt1.setDaemon(true);
        dt2.setDaemon(true);
        dt3.setDaemon(true);
//        dt.start();
//        dt.join();
//        dt1.start();
//        dt.join();
//        dt2.start();
//        dt.join();
        dt3.start();
        dt3.join();
    }
    public void run(){
        System.out.println("I'm daemon");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(currentThread().threadId());
                sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);;
        }
    }
}
