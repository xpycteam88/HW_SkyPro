package javacore.oop1;

public class Slytherin extends Hogwarts {
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int thirstForPower; //жажда власти

    public Slytherin(String firstName, String lastName, int magicPower,
                     int transgressionDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Факультет Слизерин; " + super.toString() + "; хитрость: " + cunning
                + "; решительность: " + determination + "; амбициозность: " + ambition
                + "; находчивость: " + resourcefulness + "; жажда власти: " + thirstForPower;
    }

    private int sumAllProperty() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness()
                + getThirstForPower();
    }

    public static void compareProperty(Slytherin learner1, Slytherin learner2) {
        if (learner1.sumAllProperty() > learner2.sumAllProperty()) {
            System.out.println(learner1.getFirstName() + " лучший Слизеринец, чем "
                    + learner2.getFirstName());
        } else if (learner1.sumAllProperty() < learner2.sumAllProperty()) {
            System.out.println(learner2.getFirstName() + " лучший Слизеринец, чем "
                    + learner1.getFirstName());
        } else {
            System.out.println("Свойства " + learner1.getFirstName() + " и "
                    + learner1.getFirstName() + " равны");
        }
    }

}
