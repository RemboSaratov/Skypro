package course_1.hw_9_method;

public class Task3 {

    public static void main(String[] args) {
        int days = dayToDeliver(61);
        System.out.println("Дней доставки " + days);
    }

    public static void reportBug() {
        System.out.println("!!!!!!!!");
    }

    public static int dayToDeliver(int distance) {
        int days = 0;
        if (distance > 0 && distance <= 20) {
            days += 1;
        } else if (distance > 20 && distance <= 60) {
            days += 2;
        } else if (distance > 60 && distance <= 100) {
            days += 3;
        } else {
            reportBug();
        }
        return days;
    }
}