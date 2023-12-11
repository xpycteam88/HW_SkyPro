package javacore.oop2;

public class ServiceStation {

    public void check(Bicycle bicycle) {
        updateTyre(bicycle);
        System.out.println();
    }

    public void check(Car car) {
        updateTyre(car);
        car.checkEngine();
        System.out.println();
    }

    public void check(Truck truck) {
        updateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }

    private void updateTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            vehicle.updateTyre();
        }
    }

}
