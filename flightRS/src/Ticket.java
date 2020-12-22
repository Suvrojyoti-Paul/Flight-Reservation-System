import java.time.LocalDateTime;

public abstract class Ticket {

    String pnr;
    String from;
    String to;
    Flight flight;
    Passenger passenger;
    String departureTimeStamp;
    String arrivalTimeStamp;
    String seatNo;
    float price;
    boolean cancelled;

    public Ticket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp, String seatNo, float price,
            boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureTimeStamp = departureTimeStamp;
        this.arrivalTimeStamp = arrivalTimeStamp;
        this.seatNo = seatNo;
        this.cancelled = cancelled;
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(String departureTimeStamp) {
        this.departureTimeStamp = departureTimeStamp;
    }

    public String getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(String arrivalTimeStamp) {
        this.arrivalTimeStamp = arrivalTimeStamp;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void cancelTicket(){
        this.cancelled = true;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getFlightDuration(){
       LocalDateTime departureTimeStamp = LocalDateTime.parse(this.departureTimeStamp);
       LocalDateTime arrivalTimeStamp = LocalDateTime.parse(this.arrivalTimeStamp);
       int days = arrivalTimeStamp.getDayOfMonth() - departureTimeStamp.getDayOfMonth();
       int totalHours = (days*24) + (arrivalTimeStamp.getHour() - departureTimeStamp.getHour());
       return totalHours;
   }



    @Override
    public String toString() {
        return "Ticket{" +
                "pnr='" + pnr + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", departureTimeStamp='" + departureTimeStamp + '\'' +
                ", arrivalTimeStamp='" + arrivalTimeStamp + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", price=" + price +
                ", cancelled=" + cancelled +
                '}';
    }
}
