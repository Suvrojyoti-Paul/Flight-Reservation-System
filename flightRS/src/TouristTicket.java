public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocations;

    public TouristTicket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp,
                         String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger,
                         String hotelAddress, String[] selectedTouristLocations) {
        super(pnr, from, to, departureTimeStamp, arrivalTimeStamp, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocations = selectedTouristLocations;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocations() {
        return selectedTouristLocations;
    }

    public void setSelectedTouristLocations(String[] selectedTouristLocations) {
        this.selectedTouristLocations = selectedTouristLocations;
    }
}
