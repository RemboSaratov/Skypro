package course_2.hw_3;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у машины");
        }
    }

        public void checkEngine() {
            System.out.println("Проверяем двигатель у машины");
        }

        @Override
        public void vehicleRepair() {
            updateTyre();
            checkEngine();
        }
    }
