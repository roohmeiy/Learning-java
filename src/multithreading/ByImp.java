package multithreading;

public class ByImp implements Runnable{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++) {
            Thread obj=new Thread(new ByImp());
            obj.start();
        }
    }
    public void run(){
        try {
            System.out.println("thread " + Thread.currentThread().getId());
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
