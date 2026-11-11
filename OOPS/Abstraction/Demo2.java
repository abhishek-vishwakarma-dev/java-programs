public class Demo2 {
    public static void main(String[] args) {
        Car fc = new FuelCar();
        fc.accelerate();
        fc.brake();

        Car ec = new ElectricCar();
        ec.accelerate();
        ec.brake();

    }

}

abstract class Car {
    void Start() {
        System.out.println("The car started");
    }

    abstract void accelerate();

    abstract void brake();

}

class FuelCar extends Car {

    @Override
    void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is stopping");
    }
}
