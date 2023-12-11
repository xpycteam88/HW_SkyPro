package javacore.oop1;

public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; //честь
    private int courage; //храбрость

    public Gryffindor(String firstName, String lastName, int magicPower,
                      int transgressionDistance, int nobility, int honor, int courage) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            System.out.println(nobility + " - некорректное значение");
            return;
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            System.out.println(honor + " - некорректное значение");
            return;
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if (courage < 0 || courage > 100) {
            System.out.println(courage + " - некорректное значение");
            return;
        }
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор; " + super.toString() + "; благородство: "
                + nobility + "; честь: " + honor + "; храбрость: " + courage;
    }

    private int sumAllProperty() {
        return getNobility() + getHonor() + getCourage();
    }

    public static void compareProperty(Gryffindor learner1, Gryffindor learner2) {
        if (learner1.sumAllProperty() > learner2.sumAllProperty()) {
            System.out.println(learner1.getFirstName() + " лучший Гриффиндорец, чем "
                    + learner2.getFirstName());
        } else if (learner1.sumAllProperty() < learner2.sumAllProperty()) {
            System.out.println(learner2.getFirstName() + " лучший Гриффиндорец, чем "
                    + learner1.getFirstName());
        } else {
            System.out.println("Свойства " + learner1.getFirstName() + " и "
                    + learner1.getFirstName() + " равны");
        }
    }

}
