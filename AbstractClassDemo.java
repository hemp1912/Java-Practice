abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key ignition");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick or button");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
