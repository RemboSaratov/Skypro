package Hw_4_условный_оператор;

public class Task3 {

    public static void main(String[] args) {
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно");
        }
    }

}
