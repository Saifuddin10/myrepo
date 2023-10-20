package myprogs.AllInterfaceExamples;

public interface Vehicle {
    void mileage(int liters, int kilometers);

    void vehicleDetails(String name, String model, String maxSpeed);
}

class Bike implements Vehicle {

    @Override
    public void mileage(int liters, int kilometers) {
        double mileage = (double) kilometers / liters;
        System.out.println("Mileage is : " + mileage);
    }

    @Override
    public void vehicleDetails(String name, String model, String maxSpeed) {
        System.out.println("Bike name : " + name);
        System.out.println("Model : " + model);
        System.out.println("Max Speed of Bike : " + maxSpeed);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.vehicleDetails("Speed400", "2023", "150");
        bike.mileage(10 , 600);
    }
}
