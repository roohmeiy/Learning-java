package multithreading.AdmissionProcess;

public class FeeDeposit extends Thread {
    public void run(){
        try {
            System.out.println("Depositing fee");
            sleep(10000);
            System.out.println("Fee Deposited");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
