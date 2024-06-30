package course_2.hw_3;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у велосипеда");
        }
    }


    @Override
    public void vehicleRepair() {
        updateTyre();
    }
}
