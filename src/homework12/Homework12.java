package homework12;

public class Homework12 {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Николай", "Гоголь");
        Author author3 = new Author("Паоло", "Коэльо");
        Author author5 = new Author("Паоло", "Коэльо");
        Author author4 = new Author("Майкл", "Скотт");

        Book book1 = new Book("Капитанская дочка", author1, 1836);
        Book book2 = new Book("Мёртвые души", author2, 1842);
        Book book3 = new Book("Алхимик", author3, 2001);
        Book book4 = new Book("Алхимик", author4, 2005);
        Book book5 = new Book("Алхимик", author5, 1995);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author3.hashCode());
        System.out.println(author5.hashCode());
        System.out.println(book3.equals(book5));
        /*
        book2.setPublishingYear(2005);
        System.out.println();
        System.out.println(book2);
        */
    }
}

