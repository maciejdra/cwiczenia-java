import java.util.Arrays;

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

    @Override
    public String toString() {
        return "TravelOffice{" +
                "customerCount=" + customerCount +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}
