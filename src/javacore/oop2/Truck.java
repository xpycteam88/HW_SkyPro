package javacore.oop2;

public class Truck extends Vehicle  implements Maintainable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(){
        super.updateTyre();
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
