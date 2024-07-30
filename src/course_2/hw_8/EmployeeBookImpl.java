package course_2.hw_8;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EmployeeBookImpl implements EmployeeBook {

    public static Map<String, Employee> employees;

    public EmployeeBookImpl() {
        this.employees = new HashMap<>();
    }


    public Employee addPerson(String firstName, String lastName, String department, int salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        employees.put(employee.getPersonInfo(), employee);
        return employee;
    }

    public Employee removePerson(String firstName, String lastName, String department, int salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        if (employees.containsKey(employee.getPersonInfo())) {
            employees.remove(employee.getPersonInfo());
        }
        return employee;
    }

    public Employee getPerson(String firstName, String lastName, String department, int salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        if (employees.containsKey(employee.getPersonInfo())) {
            employees.get(employee.getPersonInfo());
        }
        return employee;
    }

    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}
