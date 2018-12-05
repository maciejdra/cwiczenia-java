public class Main {

    public static void main(String[] args) {

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        Address address = new Address("Krzemieniecka","59-300", "Lubin");
        Customer customer = new Customer("Maciej");
        Trip trip = new Trip(start, end, "Lodz");

        customer.assignTrip(trip);
        customer.setAddress(address);

        System.out.println(customer.getInfo());

    }
}
