public class Demo {
    public static void main(String[] args) {
        Car fc = new FuelCar();
        fc.start();
        fc.accelerate();
        fc.brake();

        // Car ec = new ElectricCar();
        // ec.start();
        // ec.accelerate();
        // ec.brake();
        // }
    }

    interface Car {
        void start();

        void accelerate();

        void brake();
    }

    class FuelCar implements Car {

        @Override
        public void start() {
            System.out.println("Fuel car is started");

        }

        @Override
        public void accelerate() {
            System.out.println("Fuel car is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Fuel car is stopping");
        }
    }

class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("Electric car is started");

    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is stopping");
    }
}
