package course_1.hw_4_if_operator;

public class Task4 {

    public static void main(String[] args) {
        int age = 11;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " лет,то ему нужно ходить в детский сад");
        } else if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + " лет,то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет,то его место в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет,то ему пора ходить на работу");
        }
    }
}
