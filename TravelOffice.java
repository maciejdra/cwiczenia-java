import java.util.*;

public class TravelOffice {

    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> trips = new HashMap<>();

    public void addCustomer(Customer customer){

        customers.add(customer);

    }

    void showTrip(){

        for (Customer c : customers){
            System.out.println(c.toString());
        }
    }

    void addTrip(String id, Trip trip){

        trips.put(id, trip);

    }

    void removeTrip(String id){

        trips.remove(id);

    }

    public Customer findCustomerByName(String name){

        for (Customer c : customers){
            if(c.getName().equals(name)){
                System.out.println("Found");
                return cs;
            }
        }
        return null;
    }

    boolean removeCustomer(Customer c){
        
        for (c != null){
            System.out.println("Remove");
            retrun customers.remove(c);
        }
        System.out.println("Nothing to remove");
        return false;
    }
}
