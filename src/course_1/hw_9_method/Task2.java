package course_1.hw_9_method;

import java.time.LocalDate;

public class Task2 {

    public static void main(String[] args) {
        checkDevice(1,2024);
    }
    public static void checkDevice(int clientOs, int clientDeviceYear) {
        if (clientDeviceYear <= 2000 || clientOs != 0 && clientOs != 1 ) {
            System.out.println("Не правильно введенные данные");
        } else {
            int currentYear = LocalDate.now().getYear();
            var type = clientOs == 0 ? "Android" : "iOs";
            var deviceYear = clientDeviceYear < currentYear ? "облегченную" : "обычную";
            System.out.println("Установите " + deviceYear + " версию для системы " + type);
        }
    }
}