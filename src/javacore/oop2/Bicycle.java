package javacore.oop2;

public class Bicycle extends Vehicle implements Maintainable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.updateTyre();
    }

}
