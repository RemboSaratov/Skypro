package course_1.Coursework_BaseLevel;

import java.util.Objects;

public class Employee {

    private String name;
    private String department;
    private int salary;
    private int id;
    public static int idCounter = 1;

    public Employee(String name, String department, int salary) {
        this.id = idCounter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", employeeSalary=" + salary +
                ", id=" + id +
                '}';
    }
}









