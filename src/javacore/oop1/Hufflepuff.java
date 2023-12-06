package javacore.oop1;

public class Hufflepuff extends Hogwarts {
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String firstName, String lastName, int magicPower,
                      int transgressionDistance, int diligence,
                      int loyalty, int honesty) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй; " + super.toString() + "; трудолюбие: " + diligence
                + "; верность: " + loyalty + "; честность: " + honesty;
    }

    private int sumAllProperty(){
        return getDiligence() + getHonesty() + getLoyalty();
    }

    public static void compareProperty(Hufflepuff learner1, Hufflepuff learner2) {
        if (learner1.sumAllProperty() > learner2.sumAllProperty()) {
            System.out.println(learner1.getFirstName() + " лучший Пуффендуец, чем "
                    + learner2.getFirstName());
        } else if (learner1.sumAllProperty() < learner2.sumAllProperty()) {
            System.out.println(learner2.getFirstName() + " лучший Пуффендуец, чем "
                    + learner1.getFirstName());
        } else {
            System.out.println("Свойства " + learner1.getFirstName() + " и "
                    + learner1.getFirstName() + " равны");
        }
    }
}
