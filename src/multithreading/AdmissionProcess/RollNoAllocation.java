package multithreading.AdmissionProcess;

public class RollNoAllocation extends Thread{
    public void run(){
        try {
            System.out.println("Rollno. Allocation");
            sleep(10000);
            System.out.println("Rollno allocated");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
