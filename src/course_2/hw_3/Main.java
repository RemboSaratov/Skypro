package course_2.hw_3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4 );
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6 );
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        System.out.println(1);
        Vehicle.check(car, null, null);
        System.out.println(2);
        Vehicle.check(car2, null, null);
        System.out.println(3);
        Vehicle.check(null, bicycle, null);
        System.out.println(4);
        Vehicle.check(null, bicycle2, null);
        System.out.println(5);
        Vehicle.check(null, null, truck);
        System.out.println(6);
        Vehicle.check(null, null, truck2);
    }
}
