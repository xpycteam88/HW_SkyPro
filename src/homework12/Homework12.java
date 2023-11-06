package homework12;

public class Homework12 {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author gogol = new Author("Николай", "Гоголь");
        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1836);
        Book deadSouls = new Book("Мёртвые души", gogol, 1842);

        System.out.println("Книга 1: " + captainDaughter.getTitle() + ", "
                + captainDaughter.getAuthor().getFirstNameAuthor() + " "
                + captainDaughter.getAuthor().getLastNameAuthor() + ", " + captainDaughter.getPublishingYear());
        System.out.println("Книга 2: " + deadSouls.getTitle() + ", "
                + deadSouls.getAuthor().getFirstNameAuthor() + " "
                + deadSouls.getAuthor().getLastNameAuthor() + ", " + deadSouls.getPublishingYear());

        deadSouls.setPublishingYear(2005);
        System.out.println("\nКнига 2: " + deadSouls.getTitle() + ", "
                + deadSouls.getAuthor().getFirstNameAuthor() + " "
                + deadSouls.getAuthor().getLastNameAuthor() + ", " + deadSouls.getPublishingYear());
    }
}

