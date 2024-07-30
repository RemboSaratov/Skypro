package course_2.hw_8;

public interface EmployeeBook {
    Employee addPerson(String firstName, String lastName, String department, int salary);

    Employee removePerson(String firstName, String lastName, String department, int salary);

    Employee getPerson(String firstName, String lastName, String department, int salary);
}
