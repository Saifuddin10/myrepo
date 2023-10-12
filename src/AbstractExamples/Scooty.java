package AbstractExamples;

abstract class Vehicle {
    public abstract void engien();

    }
    public class Scooty extends Vehicle {

        @Override
        public void engien() {
            System.out.println("Scooty engine");
        }
        public static void main(String[] args) {
            Vehicle vehicle = new Scooty();
            vehicle.engien();
        }
    }
