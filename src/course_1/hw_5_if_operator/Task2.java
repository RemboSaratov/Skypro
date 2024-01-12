package course_1.hw_5_if_operator;

public class Task2 {

    public static void main(String[] args) {
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS != 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS != 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
}





