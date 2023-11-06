package myprogs.Collections.maps;

public class Flight {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassenger;
    private double price;
    private int confirmationNumber;

    public Flight() {
    }

    public Flight(int flightNumber, String passengerName, String origin, String destination,
                  String date, int numPassenger, double price, int confirmationNumber) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassenger = numPassenger;
        this.price = price;
        this.confirmationNumber = confirmationNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmation) {
        this.confirmationNumber = confirmation;
    }
}
