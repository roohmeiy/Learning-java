package multithreading;

public class TestPriority implements Runnable{
    public static void main(String args[]){
        Thread ob1=new Thread(new TestPriority());
        Thread ob2=new Thread(new TestPriority());
        Thread ob3=new Thread(new TestPriority());
        ob1.setPriority(Thread.MIN_PRIORITY);
        ob2.setPriority(Thread.NORM_PRIORITY);
        ob3.setPriority(Thread.MAX_PRIORITY);
        ob1.setName("T1");
        ob2.setName("T2");
        ob3.setName("T3");
        ob1.start();
        ob2.start();
        ob3.start();

    }
    public void run(){
        try{
            System.out.println("Running thread: " + Thread.currentThread().getName() +
                    " with priority: " + Thread.currentThread().getPriority());
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
