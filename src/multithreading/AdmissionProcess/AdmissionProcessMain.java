package multithreading.AdmissionProcess;

public class AdmissionProcessMain {
    public static void main(String[] args) throws InterruptedException {
        Admission admission=new Admission();
        admission.start();
//        admission.join();
        admission.interrupt(); //interrupted status -> true

//        FeeDeposit feeDeposit=new FeeDeposit();
//        feeDeposit.start();
//        feeDeposit.join();
//
//        RollNoAllocation rollNoAllocation=new RollNoAllocation();
//        rollNoAllocation.start();
//        rollNoAllocation.join();
    }
}
