package homework12;

import java.util.Objects;

public class Book {
    private final String title;
    private Author author;
    private int publishingYear;
    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " + title + "; " + author + " год публикации: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }
}

