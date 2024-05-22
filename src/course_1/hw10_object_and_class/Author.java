package course_1.hw10_object_and_class;

public class  Author {

    private String firstName; // idea предлагает добавить final к privat в обоих класаах, но этого вроде как не требуется
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
}
