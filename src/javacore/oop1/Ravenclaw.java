package javacore.oop1;

public class Ravenclaw extends Hogwarts {
    private int wit; //ум
    private int wisdom; //мудрость
    private int wittiness; //остроумие
    private int creativity; //творчество

    public Ravenclaw(String firstName, String lastName,
                     int magicPower, int transgressionDistance, int wit,
                     int wisdom, int wittiness, int creativity) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.wit = wit;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Факультет Когтевран; " + super.toString() + "; ум: " + wit + "; мудрость: " + wisdom
                + "; остроумие: " + wittiness + "; творчество: " + creativity;
    }

    private int sumAllProperty(){
        return getWit() + getWisdom() + getWittiness() + getCreativity();
    }
    public static void compareProperty(Ravenclaw learner1, Ravenclaw learner2) {
        if (learner1.sumAllProperty() > learner2.sumAllProperty()) {
            System.out.println(learner1.getFirstName() + " лучший Когтевранец, чем "
                    + learner2.getFirstName());
        } else if (learner1.sumAllProperty() < learner2.sumAllProperty()) {
            System.out.println(learner2.getFirstName() + " лучший Когтевранец, чем "
                    + learner1.getFirstName());
        } else {
            System.out.println("Свойства " + learner1.getFirstName() + " и "
                    + learner1.getFirstName() + " равны");
        }
    }

}
