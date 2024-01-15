package course_1.hw_4_if_operator;

public class Task6 {

    public static void main(String[] args) {
        int carriageCapacity = 102;
        int seatPlace = 60;
        //я так понял количество пассажиров нужно задать нужно самому
        int passengers = 77;
        if (passengers < seatPlace) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (passengers > seatPlace && passengers < carriageCapacity) {
            System.out.println("В вагоне есть только стоячие места");
        } else if (passengers >= carriageCapacity) {
            System.out.println("Вагон полностью забит");
        }
    }
}
