package course_1.hw10_object_and_class;

public class Author {

    String firstNameAuthor;
    String secondNameAuthor;

    public Author(String firstNameAuthor, String secondNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.secondNameAuthor = secondNameAuthor;
    }
    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }
    public String getSecondNameAuthor() {
        return secondNameAuthor;
    }
}
