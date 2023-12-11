package javacore.oop2;

public class Main {
    public static void main(String[] args) {

        Maintainable bicycle = new Bicycle("bicycle1", 2);
        Maintainable bicycle2 = new Bicycle("bicycle2", 2);

        Maintainable car = new Car("car1", 4);
        Maintainable car2 = new Car("car2", 4);

        Maintainable truck = new Truck("truck1", 6);
        Maintainable truck2 = new Truck("truck2", 8);


        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
    }
}
