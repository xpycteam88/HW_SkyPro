package javacore.oop2;

public class Car extends Vehicle  implements Maintainable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
