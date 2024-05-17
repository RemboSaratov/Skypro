package course_1.hw_9_method;

public class Task3 {

    public static void main(String[] args) {
        printDeliveryDateCard(95);
    }
    public static void printDeliveryDateCard(int distance) {
       if (distance > 0 && distance <= 20) {
           System.out.println("Потребуется 1 день доставки");
       } else if (distance > 20 && distance <= 60) {
           System.out.println("Потребуется 2 дня доставки");
       } else if (distance > 60 && distance <= 100) {
           System.out.println("Потребуется 3 дня доставки");
       } else {
           System.out.println("Доставка не осуществляется");
       }
    }
}
///