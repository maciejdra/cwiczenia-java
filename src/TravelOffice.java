public class TravelOffice {
    int customerCount = 0;
    Customer customers[] = new Customer[2];

    public void addCustomer(Customer customer) {
        if (customerCount == customers.length) {
            Customer temp[] = new Customer[customers.length + 2];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            customers = temp;
        }
        customers[customerCount++] = customer;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getInfo() {
        String report = "";
        for (int i = 0; i < customerCount; i++) {
            report += customers[i].getInfo() + "\n";
        }
        return report;
    }

    public static void main(String[] args) {

        TravelOffice to = new TravelOffice();

        Date start = new Date(2015,7,23);
        Date end = new Date(2015,7,25);
        Trip trip = new Trip(start, end,  "Lodz");

        Customer customer = new Customer("Maciej");
        customer.setAddress(new Address("Krzemieniecka 18A", "59-300", "Lubin"));
        customer.assignTrip(trip);
        to.addCustomer(customer);

        customer = new Customer("Artur");
        customer.setAddress(new Address("Kowale 22", "62-700", "Turek"));
        customer.assignTrip(trip);
        to.addCustomer(customer);

        customer = new Customer("Maciej");
        customer.setAddress(new Address("Goszczanow", "77-554", "Goszczanow"));
        customer.assignTrip(trip);
        to.addCustomer(customer);

        System.out.println(to.getInfo());
    }
}
