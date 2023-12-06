package javacore.oop1;

import static javacore.oop1.Hogwarts.compareProperty;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри", "Поттер", 75,
                        56, 85, 75, 99),
                new Gryffindor("Гермиона", "Грейнджер", 85,
                        85, 91, 86, 75),
                new Gryffindor("Рон", "Уизли", 65,
                        50, 90, 70, 81),
                new Hufflepuff("Захария", "Смитт", 52,
                        65, 85, 76, 69),
                new Hufflepuff("Седрик", "Диггори", 65,
                        78, 89, 66, 82),
                new Hufflepuff("Джастин", "Финч-Флетчли", 45,
                        51, 71, 63, 76),
                new Ravenclaw("Чжоу", "Чанг", 69,
                        67, 77, 78, 86, 91),
                new Ravenclaw("Падма", "Патил", 67,
                        65, 52, 85, 46, 74),
                new Ravenclaw("Маркус", "Белби", 69,
                        76, 56, 78, 45, 88),
                new Slytherin("Драко", "Малфой", 81,
                        75,75,85,100,56,
                        85),
                new Slytherin("Грэхэм", "Монтегю", 45,
                        40,65,61,63,71,
                        70),
                new Slytherin("Грегори", "Гойл", 41,
                        45,61,65,67,56,
                        69)
                };

        System.out.println(hogwarts[2].toString());
        compareProperty(hogwarts[0], hogwarts[1]);
        Gryffindor.compareProperty((Gryffindor) hogwarts[0], (Gryffindor) hogwarts[1]);
        Hufflepuff.compareProperty((Hufflepuff) hogwarts[3], (Hufflepuff) hogwarts[5]);
        Ravenclaw.compareProperty((Ravenclaw) hogwarts[6], (Ravenclaw) hogwarts[7]);
        Slytherin.compareProperty((Slytherin) hogwarts[9], (Slytherin) hogwarts[11]);
    }

}
