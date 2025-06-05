package multithreading.AdmissionProcess;

public class Admission extends Thread {
    @Override

    public void run(){
//        System.out.println(isInterrupted());  //true
        System.out.println(interrupted());  //true--->false not vice versa(prints true and do it false)
        try {
            System.out.println("Admission started");
            sleep(1000);        // --->get interrupted status true and do it false
            System.out.println("Admission completed");
        } catch (InterruptedException e) {
            System.out.println("Interruption  occurred.............");;
        }
    }
}
