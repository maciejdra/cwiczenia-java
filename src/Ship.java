public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 700;
    }

    @Override
    double getDistance() {
        return 200;
    }

    @Override
    public void dock() {
        System.out.println("Dock to the edge ");
    }

    @Override
    public void stop() {
        dock();
    }
}
