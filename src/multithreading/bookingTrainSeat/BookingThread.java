package multithreading.bookingTrainSeat;

public class BookingThread extends Thread{
    BookTrainSeat bt;
    int seats;

    public BookingThread(BookTrainSeat bt, int seats){
        this.bt=bt;
        this.seats=seats;
    }

    @Override
    public void run() {
        bt.bookSeat(seats, currentThread().getName());
    }
}

