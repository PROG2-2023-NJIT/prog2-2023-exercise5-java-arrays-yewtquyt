package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        int size = 3;
        FlightBooking fb = new FlightBooking(size);
        String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
        String [] gender = {"Male", "Female", "Other"};
        int [] age = {43, 32, 21};

        for(int i=0; i<size; ++i){
            fb.setPassengerFullName(i, fullName[i]);
            fb.setPassengerGender(i, gender[i]);
            fb.setPassengerAge(i, age[i]);
        }

        String ticketNumber = fb.getTicketNumber(3);
        fb.setTripSource("1");
        fb.setTripDestination("1", "2");
        fb.setTripType("1");
        fb.setBookingClass("1");

        for(int j=0; j<size; ++j){
            if((fb.getPassengerFullName(j) == fullName[j]) && (fb.getPassengerGender(j) == gender[j])
                    && fb.getPassengerAge(j) == age[j]){
                fb.setPassengerFullName(1,"Matt Jive");
            }
            else{
                fb.setPassengerFullName(1,"Sally Fields");
            }
        }

    }



}
