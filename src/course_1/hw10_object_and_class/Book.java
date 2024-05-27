package course_1.hw10_object_and_class;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getNameBook() {
        return nameBook;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override public String toString() {
        return  "Name: " + nameBook + ", "  + author + ": , " + "Publishing Year: " + publishingYear;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override public int hashCode() {
        return Objects.hash(nameBook, author, publishingYear);
    }
}

