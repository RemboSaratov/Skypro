package course_1.Coursework_BaseLevel;

public class Main {


    public static Employee employees[] = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Corolev Ivan Olegovich", "department1", 30000);
        employees[1] = new Employee("B D P", "department2", 25000);
        employees[2] = new Employee("D M D", "department1", 44000);
        employees[3] = new Employee("G O P", "department3", 32000);
        employees[4] = new Employee("V D I", "department4", 50000);
        employees[5] = new Employee("C L E", "department2", 22000);
        employees[6] = new Employee("Z I I", "department5", 46000);
        employees[7] = new Employee("Z V E", "department5", 51000);
        employees[8] = new Employee("B I E", "department4", 50000);
        employees[9] = new Employee("Z I B", "department2", 134000);
        getListOfEmployees();
        getSeparator();
        System.out.println(getMonthlySalaryAmount());
        getSeparator();
        System.out.println(getMinSalary());
        getSeparator();
        System.out.println(getMaxSalary());
        getSeparator();
        System.out.println(getAverageSalary());
        getSeparator();
        getNameEmployee();
    }
    public static void getSeparator() {
        System.out.println("================================================================================================");
    }

    public static void getListOfEmployees() {
        for (Employee element : employees) {
            System.out.println(element);
        }
    }

    public static int getMonthlySalaryAmount() {
        int sum = 0;
        for (Employee element : employees) {
            sum += element.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public static Employee getMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if(employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public static int getAverageSalary() {
        int sum = 0;
        for (Employee element : employees) {
            sum += element.getSalary();
        }
        sum = sum / employees.length;
        return sum;
    }
    public static void getNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

