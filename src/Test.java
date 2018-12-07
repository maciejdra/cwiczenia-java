public class Test {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Seat");
        vehicles[1] = new Plane("Boening");
        vehicles[2] = new RaceCar("Formula 1");
        vehicles[3] = new Truck("Scania");
        vehicles[4] = new Ship("Boat");


        for (Vehicle veh : vehicles){
            if(veh instanceof Flying){
                ((Flying) veh).callAirControl();
            }
            veh.go();
            veh.stop();
            System.out.println("Fuel: "+veh.calculateFuelConsumption());
        }
    }
}
