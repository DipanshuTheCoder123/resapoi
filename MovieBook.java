// Shared Resource (NOT a Thread)
class Theatre {

    private int totalSeat = 10;

    // synchronized method → object level lock
     void book(int seat) {

        if (totalSeat >= seat) {
            System.out.println(Thread.currentThread().getName()
                    + " is trying to book " + seat + " seats");

            totalSeat -= seat;

            System.out.println(Thread.currentThread().getName()
                    + " booked successfully, remaining seats = " + totalSeat);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " cannot book " + seat
                    + " seats, only " + totalSeat + " left");
        }
    }
}

// Thread class
public class MovieBook extends Thread {

    static Theatre theatre;   // shared object
    int seat;

    public MovieBook(int seat) {
        this.seat = seat;
    }

    @Override
    public void run() {
        theatre.book(seat);
    }

    public static void main(String[] args) {

        theatre = new Theatre();   // ONE shared resource

        MovieBook t1 = new MovieBook(7);
        t1.setName("Thread-1");

        MovieBook t2 = new MovieBook(6);
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
