package course_1.hw_9_method;

public class Task1 {

    public static void main(String[] args) {
        int year = 2024; // or receivingYear(2024)
        receivingYear(year);
    }
    public static void receivingYear(int year) {
        if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
