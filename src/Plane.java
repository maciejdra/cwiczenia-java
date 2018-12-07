public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 800;
    }

    @Override
    double getDistance() {
        return 2000;
    }

    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }

    @Override
    public void stop() {
        land();
    }

    @Override
    public void go() {
        takeOff();
    }

    @Override
    public void callAirControl() {
        System.out.println("Call air control");
    }
}
