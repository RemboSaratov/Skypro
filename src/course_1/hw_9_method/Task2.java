package course_1.hw_9_method;

public class Task2 {

    public static void main(String[] args) {
        int clientOs = 1; //
        int clientDeviceYear = 2024;
        checkDevice(clientOs, clientDeviceYear); // or checkDevice(1,2024)
    }
    public static void checkDevice(int clientOs, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) { // старше текущего года
            System.out.println("Установите облегченную версию для Android по ссылке");
            // в оригинальной задаче устройству старше 2015 нужно было ставить обычную версию / исправил
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) { // старше текущего года
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Ваша операционная система не поддерживается"); // если != 0 && != 1
        }
    }
}