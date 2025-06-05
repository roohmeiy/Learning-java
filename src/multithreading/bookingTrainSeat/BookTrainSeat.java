package multithreading.bookingTrainSeat;

public class BookTrainSeat {
    int totalSeat=14;

    synchronized public void bookSeat(int seat, String name){
        if(totalSeat>=seat){
            totalSeat=totalSeat-seat;
            System.out.println(seat + " Seats booked successfully for " + name);
            System.out.println("Total seats remaining: " + totalSeat);
            System.out.println();
        }
        else {
            System.out.println("\nSorry " + name + "!!!");
            System.out.println("You can't book tickets. Total seats remaining: " + totalSeat);
        }
    }
}
