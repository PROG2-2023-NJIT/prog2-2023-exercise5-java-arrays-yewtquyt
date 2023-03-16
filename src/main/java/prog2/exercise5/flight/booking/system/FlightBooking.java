package prog2.exercise5.flight.booking.system;






import java.util.Random;
import java.time.LocalDate;
public class FlightBooking {

    private TripSource tripSource;
    private String[] TicketNumber;
    private String FlightCompany;
    private String TripDestination;
    private LocalDate DepartingOn;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private int TotalPassengers;
    private int ChildrenPassengers;
    private int AdultPassengers;
    private int TotalTickets;
    private double TotalTicketPrice;
    private double DepartingTicketPrice ;
    private double ReturnTicketPrice;
    private  String[] PassengerFullName  = {"Matt Jive", "Sally Fields", "Posh Quattro"};;
    private String[] PassengerGender = {"Male", "Female", "Other"};
    private int[] PassengerAge = {43, 32, 21};


    public FlightBooking(int TotalTickets){
        this.TotalTickets = TotalTickets;
        this.PassengerFullName = new String[TotalTickets];
        this.PassengerGender = new String[TotalTickets];
        this.PassengerAge = new int[TotalTickets];
        this.TicketNumber = new String[TotalTickets];
    }
    String sdepart = "2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);
    String sreturn = "2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);


    public  LocalDate getDepartingOn(){
        return DepartingOn;
    }




    public String getPassengerFullName(int j){
        return PassengerFullName[j];
    }
    public String getFlightCompany(){
        return FlightCompany;
    }

    public LocalDate getDepartureDate(){
        return DepartureDate;
    }
    public LocalDate getReturnDate(){
        return ReturnDate;
    }
    public int getTotalPassengers(){
        return TotalPassengers;
    }
    public int getChildrenPassengers(){
        return ChildrenPassengers;
    }
    public int getAdultPassengers(){
        return AdultPassengers;
    }
    public double getTotalTicketPrice(){
        return TotalTicketPrice;
    }
    public double getDepartingTicketPrice() {
        return DepartingTicketPrice;
    }

    public double getReturnTicketPrice() {
        return ReturnTicketPrice;
    }
    public String  getPassengerGender(int j){ return PassengerGender[j];}
    public int  getPassengerAge(int j){ return PassengerAge[j];}

    public TripSource getTripSource(){
        return tripSource;
    }
    enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    public void setTripSource(String TripSource) {
        switch (TripSource) {
            case "1":
                this.tripSource = tripSource.NANJING;
                break;
            case "2":
                this.tripSource = tripSource.BEIJING;
                break;
            case "3":
                this.tripSource = tripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = tripSource.OULU;
                break;
            case "5":
                this.tripSource = tripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = tripSource.PARIS;
                break;
            default:
                break;
        }


    }


    private TripDestination tripDestination;
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    public void setTripDestination(String TripDestination,String s){
        switch (s){
            case "1":
                this.tripDestination = tripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = tripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = tripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = tripDestination.OULU;
                break;
            case "5":
                this.tripDestination = tripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = tripDestination.PARIS;
                break;
            default:
                break;
        }
    }





        private TripType tripType;
    public TripSource gettripType(){
        return tripSource;
    }
    enum TripType {
        ONE_WAY, RETURN
    }
    public void setTripType(String triptype) {
        switch (triptype) {
            case "1":
                this.tripType = tripType.ONE_WAY;
                break;
            case "2":
                this.tripType = tripType.RETURN;
                break;
            default:
                break;

        }
    }


    private BookingClass bookingClass;

    enum  BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    public void setBookingClass(String bookingclass) {
        switch (bookingclass) {
            case "1":
                this.bookingClass = bookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = bookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = bookingClass.ECONOMY;
                break;
            default:
                break;
        }
    }






    private String SourceAirport;
    public String getSourceAirport(){
        return SourceAirport;
    }
    enum  SourceAirport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport
    }
    public void setSourceAirport(String SourceAirport){
        switch(SourceAirport){
            case "Nanjing_Lukou_International_Airport":
                this.SourceAirport = "Nanjing_Lukou_International_Airport";
                break;
            case "Beijing_Capital_International_Airport":
                this.SourceAirport = "Beijing_Capital_International_Airport";
                break;
            case "Shanghai_Pudong_International_Airport":
                this.SourceAirport = "Shanghai_Pudong_International_Airport";
                break;
            case "Oulu_Airport":
                this.SourceAirport = "Oulu_Airport";
                break;
            case "Helsinki_Airport":
                this.SourceAirport = "Helsinki_Airport";
                break;
            case "Paris_Charles_de_Gaulle_Airport":
                this.SourceAirport = "Paris_Charles_de_Gaulle_Airport";
                break;
            default:
                break;

        }

    }





    private String DestinationAirport;
    public String getDestinationAirport(){
        return DestinationAirport;
    }
    enum  DestinationAirport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport
    }
    public void setDestinationAirport(String DestinationAirport,String s){
        switch(DestinationAirport){
            case "Nanjing_Lukou_International_Airport":
                this.DestinationAirport = "Nanjing_Lukou_International_Airport";
                break;
            case "Beijing_Capital_International_Airport":
                this.DestinationAirport = "Beijing_Capital_International_Airport";
                break;
            case "Shanghai_Pudong_International_Airport":
                this.DestinationAirport = "Shanghai_Pudong_International_Airport";
                break;
            case "Oulu_Airport":
                this.DestinationAirport = "Oulu_Airport";
                break;
            case "Helsinki_Airport":
                this.DestinationAirport = "Helsinki_Airport";
                break;
            case "Paris_Charles_de_Gaulle_Airport":
                this.DestinationAirport = "Paris_Charles_de_Gaulle_Airport";
                break;
            default:
                break;

        }

    }






    Random random = new Random();
    public String getTicketNumber(int i) {
        setTicketNumber(1);
        return TicketNumber[i];
    }

    public void setTicketNumber(int i){
        String ticketNumber = null;
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }

        for (int a=0; a<4; a++) {
            char n = (char) ((random.nextInt(45) + 65));
            ticketNumber = ticketNumber + n;

        }
        switch (tripSource){
            case NANJING:
                switch (tripDestination){
                    case BEIJING:
                    case SHANGHAI:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case OULU:
                    case PARIS:
                    case HELSINKI:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case BEIJING:
                switch (tripDestination){
                    case NANJING:
                    case SHANGHAI:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case OULU:
                    case PARIS:
                    case HELSINKI:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case SHANGHAI:
                switch (tripDestination){
                    case BEIJING:
                    case NANJING:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case OULU:
                    case PARIS:
                    case HELSINKI:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case OULU:
                switch (tripDestination){
                    case HELSINKI:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                    case PARIS:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case HELSINKI:
                switch (tripDestination){
                    case OULU:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                    case PARIS:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case PARIS:
                switch (tripDestination){
                    case NANJING:
                    case BEIJING:
                    case SHANGHAI:
                    case OULU:
                    case HELSINKI:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
        }
        this.TicketNumber [i] = ticketNumber;
    }


        public void setPassengerFullName(int i,String passengerFullName){
        this.PassengerFullName = new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};
    }



    public void setFlightCompany(String FlightCompany){
        this.FlightCompany = FlightCompany;
    }


    public void setDepartureDate(LocalDate DepartureDate){
        this.DepartureDate = DepartureDate;
    }

    public void setReturnDate(LocalDate ReturnDate){
        this.ReturnDate = departureDate.plusDays(2);;
    }

    public void setTotalPassengers(int ChildrenPassengers, int AdultPassengers){
        this.TotalPassengers = ChildrenPassengers + AdultPassengers;
    }

    public void setDepartingTicketPrice(int childTicketPrice,int adultsTicketPrice) {
        DepartingTicketPrice = DepartingTicketPrice;
    }

    public void setReturnTicketPrice() {
        this.ReturnTicketPrice = TotalTicketPrice;
    }

    public void setTotalTicketPrice(){
        this.TotalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public void setPassengerGender(int i,String s){
        this.PassengerGender = new String[]{"Male", "Female", "Other"};
    }

    public void setPassengerAge(int i,int j) {
        this.PassengerAge = new int[]{43, 32, 21};
    }



    public String toString(){
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + tripSource+ " to " + TripDestination + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }

    private Confirmation confirmation;
    public Confirmation getconfirmation(){
        return confirmation;
    }
    enum Confirmation{
        Changed,Not_Changed
    }

    public void setConfirmation(String Confirmation) {
        switch (Confirmation){
            case "Changed":
                this.confirmation = confirmation.Changed;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details " +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber +
                        "\nPassenger Name: " + PassengerFullName +
                        "\nFrom TripSource to " + tripDestination +
                        "\nDate of departure: " + DepartureDate +
                        "\nDate of return: ReturnDate (Changed from old ReturnDate to new" +
                        ReturnDate + ")" +
                        "\nTotal passengers: " + TotalPassengers +
                        "\nTotal ticket price in Euros: " + TotalTicketPrice +
                        "\nIMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date");
                break;
            case "Not_Changed":
                this.confirmation = confirmation.Not_Changed;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details " +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber +
                        "\nPassenger Name: " + PassengerFullName +
                        "\nFrom TripSource to " + tripDestination +
                        "\nDate of departure: " + DepartureDate +
                        "\nDate of return: " + ReturnDate +
                        "\nTotal passengers: " + TotalPassengers +
                        "\nTotal ticket price in Euros: " + TotalTicketPrice);

                break;
        }

    }

    public void DisplayTripDetails() {
        System.out.println("Thank you for booking your flights with " + FlightCompany + "\n"+
        "You reserved a total of" + TotalTickets + " tickets.\n");
        for (int i = 0; i < TotalTickets;i++){
            System.out.println("Here are the trip details for Passenger No." + (i + 1) +
                               "\nPassenger's Ticket Number:" + getTicketNumber(i) +
                               "\nPassenger's Full Name: " + getPassengerFullName(i) +
                               "\nPassenger's Age:" + getPassengerAge(i) +
                               "\nPassenger's Gender:" + getPassengerGender(i) +
                               "\nFrom:" + tripSource +
                               "\nTo:" + tripDestination +
                               "\nThe flight departs on:" + departureDate +
                               "\nAnd the return flight is on:" + returnDate);
        }
    }


}


