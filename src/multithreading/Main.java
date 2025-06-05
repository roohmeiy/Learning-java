package multithreading;

public class Main {
    public static void main(String[] args) {
        Thread obj=new Thread(new ByImp());
        obj.setName("Thread imp");
        obj.start();
//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("before yield");
//                Thread.sleep(1000);
//            }
//            Thread.yield();
//            for (int i = 0; i < 5; i++) {
//                System.out.println("after yield");
//                Thread.sleep(1000);
//            }
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        obj.interrupt();

//        ByExt ob=new ByExt();
//        ob.setName("Thread ext");
//        ob.start();
    }
}
