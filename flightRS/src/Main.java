import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("4th Street", "Hyderabad","Telangana",
                "nitin", "8790914565", "nk67@gmail.com");
        Flight flight = new Flight("124Tr","Indigo", 186, 7);

        RegularTicket regularTicket = new RegularTicket("56PNR234", "Hyd", "Del",
                "20/12/20", "21/12/20", "12B",
                2300, false, flight, passenger, "massage");

        String hotelAddress = "Mariott Hotel, Delhi";
        String[] locations = {"Agra","New Delhi"};

        TouristTicket touristTicket = new TouristTicket("56PNR354", "Hyd", "Del",
                "20/12/20", "21/12/20", "12B",
                2300, false, flight, passenger, hotelAddress,locations);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

}
