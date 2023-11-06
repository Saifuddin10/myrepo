package myprogs.Collections.maps;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {
    public ArrayList<Flight> flights;
    public ArrayList<Hotel> hotels;

    public TravelApp() {
        this.flights = new ArrayList<Flight>();
        this.hotels = new ArrayList<Hotel>();
    }

    public void searchFlight(String origin, String destination, String date, int numPassengers) {
        System.out.println("Searching for flights from" + origin + " to " + destination + " on "
                + date + " for " + numPassengers + " passengers ");
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to "
                + checkOut + " For " + numGuests + " guests ");
    }

    public void bookingFlight(int flightNo, String passengerName, String origin, String destination,
                              String date, int numPassenger, double price, int confirmationNumber) {
        Flight flight = new Flight(flightNo, passengerName, origin, destination,
                date, numPassenger, price, confirmationNumber);
        flight.setConfirmationNumber(confirmationNumber);
        this.flights.add(flight);
        System.out.println("Flight booked! Confirmation number : " + confirmationNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, String checkIn,
                          String checkOut, int numGuests, double price, int confirmationNumber) {
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn,
                checkOut, numGuests, price, confirmationNumber);
        hotel.setConfirmationNumber(confirmationNumber);
        this.hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number : " + confirmationNumber);

    }

    public void cancelBooking(int confirmationNumber) {
        for (Flight flight : this.flights) {
            if (flight.getConfirmationNumber() == confirmationNumber) {
                this.flights.remove(flight);
                System.out.println("Flight reservation number with confirmation number " + confirmationNumber + " cancelled. ");
                return;
            }
        }
        System.out.println("No reservation found with this confirmation number : " + confirmationNumber);
    }

    private int generateConformationNumber() {
        Random random = new Random();
        return random.nextInt(850000) + 100000;
    }

    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.searchFlight("Hyderabad", "Delhi", "6-11-2023", 2);
        app.searchHotels("Delhi", "6-11-2023", "10-11-2023", 2);
        app.bookingFlight(123456789, "Saif", "Hyderabad",
                "Delhi", "6-11-2023", 2, 1200, 6700012);
        app.bookHotel(77893212, "Saif", "Delhi", "6-11-2023",
                "10-11-2023", 2, 2000, 234566721);
        app.cancelBooking(6700012);
    }
}