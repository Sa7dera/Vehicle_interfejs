interface Vehicle{
    void start();

    void stop();

    default void fuelUp(){
        System.out.println("tankowanie");
    }

    static void service(){
        System.out.println("pojazd wymaga serwisu");
    }
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car start");
    }
    public void stop(){
        System.out.println("Car stop");
    }
}

class Motorcycle implements Vehicle{
    public void start(){
        System.out.println("Motorcycle start");
    }
    public void stop(){
        System.out.println("Motorcycle stop");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle.service();


        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.fuelUp();


        Vehicle vehicle1 = new Motorcycle();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.fuelUp();

    }
}