package course_1.hw10_object_and_class;

import java.util.Objects;

public class  Author {

    private String firstName; // idea предлагает добавить final к privat в обоих класаах, но этого вроде как не требуется
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        // используется для того, чтобы явно показать, к какой конкретно переменной мы обращаемся
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }

    @Override public String toString() {
        return "Author " +
                "Firstname: '" + firstName + '\'' +
                ", Surname: '" + secondName + '\'';
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }

    @Override public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}



