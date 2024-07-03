package course_2.hw_3;

public abstract class Vehicle implements VehicleRepair {

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public static void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
                car.vehicleRepair();
            } else if (truck != null) {
                System.out.println("Обслуживаем " + truck.getModelName());
                    truck.vehicleRepair();
            } else if (bicycle != null) {
                System.out.println("Обслуживаем " + bicycle.getModelName());
                    bicycle.vehicleRepair();
                }
            }
        }
