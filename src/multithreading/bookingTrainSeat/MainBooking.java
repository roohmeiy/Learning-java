package multithreading.bookingTrainSeat;

public class MainBooking {
    public static void main(String[] args) {
        BookTrainSeat bt=new BookTrainSeat();

        BookingThread payal=new BookingThread(bt,5);
        payal.setName("Payal");
        payal.start();

        BookingThread pihu=new BookingThread(bt,5);
        pihu.setName("Pihu");
        pihu.start();

        BookingThread arun=new BookingThread(bt,5);
        arun.setName("Arun");
        arun.start();
    }
}
