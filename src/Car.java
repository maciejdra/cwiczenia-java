public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 10;
    }

    @Override
    double getDistance() {
        return 50;
    }
}
