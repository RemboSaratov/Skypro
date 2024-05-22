package course_1.hw10_object_and_class;

public class Main {

    public static void main(String[] args) {
        Author book1 = new Author("Howard", "Lovecraft");
        Author book2 = new Author("Richard", "Dawkins");
        Book one = new Book("Dagon", book1, 1822);
        Book two = new Book("The Selfish Gene", book2, 1976);
        // Проверка
        System.out.println("Название книги: " + one.getNameBook());
        System.out.println("Автор: " + book1.getFirstName() + " " + book1.getSecondName());
        System.out.println("Год выпуска: " + one.getPublishingYear());
        one.setPublishingYear(1834);
        System.out.println("Год выпуска: " + one.getPublishingYear());
    }
}
