package course_2.hw_3;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у трака");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у трака");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у трака");
    }

    @Override
    public void vehicleRepair() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
