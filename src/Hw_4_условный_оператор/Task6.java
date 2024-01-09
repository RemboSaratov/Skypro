package Hw_4_условный_оператор;

public class Task6 {

    public static void main(String[] args) {
        int carriageCapacity = 102;
        int seatPlace = 60;
        //я так понял количество пассажиров нужно задать нужно самому
        int passengers = 77;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (passengers > 60 && passengers < 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else if (passengers == 102) {
            System.out.println("Вагон полностью забит");
        }
    }
}
