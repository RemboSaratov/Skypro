package course_1.hw_9_method;

import java.time.LocalDate;

public class Task2 {

    public static void main(String[] args) {
        int clientOs = 0;
        int clientDeviceYear = 2024;
        checkDevice(clientOs, clientDeviceYear); // or checkDevice(0,2024)
    }

    public static void checkDevice(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOs == 1) {
            // год выпуска устройства меньше текущего года,значит оно "старше"(из условия задачи) текущего года, я так понимаю
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear == currentYear && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear == currentYear && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Не правильно введенные данные");
        }
    }
}
