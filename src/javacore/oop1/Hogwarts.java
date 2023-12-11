package javacore.oop1;

public abstract class Hogwarts {
    private final String firstName;
    private final String lastName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String firstName, String lastName, int magicPower, int transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0 || magicPower > 100) {
            System.out.println(magicPower + " - некорректное значение");
            return;
        }
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0 || transgressionDistance > 100) {
            System.out.println(transgressionDistance + " - некорректное значение");
            return;
        }
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя и фамилия: " + firstName + ' ' + lastName +
                "; cила магии: " + magicPower + "; дистанция трансгрессии: " + transgressionDistance;
    }

    private String fullName() {
        return firstName + ' ' + lastName;
    }

    private int sumAllProperty() {
        return getMagicPower() + getTransgressionDistance();
    }

    public static void compareProperty(Hogwarts a, Hogwarts b) {
        if (a.sumAllProperty() > b.sumAllProperty()) {
            System.out.println(a.fullName() + " обладает большей силой магии, чем " + b.fullName());
        } else if (b.sumAllProperty() > a.sumAllProperty()) {
            System.out.println(b.fullName() + " обладает большей силой магии, чем " + a.fullName());
        } else {
            System.out.println("Cила магии равна");
        }
    }



}