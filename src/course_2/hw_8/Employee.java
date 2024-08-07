package course_2.hw_8;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private int salary;
    private int id;
    public static int idCounter = 1;

    public Employee(String firstName, String lastName, String department, int salary) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getPersonInfo() {
        return firstName + " " + lastName + " " + department + " " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }

    @Override public int hashCode() {
        return Objects.hash(firstName, lastName, department, salary);
    }
}

