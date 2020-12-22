public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeat;

    public  Flight(String flightNumber, String airline, int capacity, int bookedSeat){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeat = bookedSeat;
    }

    public boolean checkAvailability(){

        if(this.bookedSeat < capacity)
            return true;
        else
            return false;
    }

    public void incrementBookingCounter(){
        this.bookedSeat++;
    }

}
