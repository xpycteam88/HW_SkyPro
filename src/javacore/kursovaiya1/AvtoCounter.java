package javacore.kursovaiya1;
// вынес статическую переменную, т.к. она не относится к свойства объекта класса Emloyee
final class AvtoCounter {

    private static int counter = 0;

    public static int getCounter() {
        counter++;
        return counter;
    }

}
