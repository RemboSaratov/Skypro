package course_1.hw_5_if_operator;

public class Task3 {

    public static void main(String[] args) {
        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
