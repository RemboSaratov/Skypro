package course_1.hw_5_if_operator;

public class Task4 {

    public static void main(String[] args) {
        int deliveryDistance = 95;
        int fastDelivery = 1;
        int midDelivery = 2;
        int slowDelivery = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + fastDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + midDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + slowDelivery);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}
