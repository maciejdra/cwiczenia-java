public class TravelOffice {

    public static int customerCount = 0;
    public static Customer[] tab = new Customer[2];

    public static void main(String[] args) {

        int customerCount = 0;
        Customer[] tab = new Customer[2];

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        Address address = new Address("Krzemieniecka","59-300", "Lubin");
        //Customer customer = new Customer("Maciej");
        Trip trip = new Trip(start, end, "Lodz");

        Customer ob = new Customer("Maciej");
        Customer ob2 = new Customer("Ola");
        Customer ob3 = new Customer("Dawid");

        ob.assignTrip(trip);
        ob2.assignTrip(trip);
        ob3.assignTrip(trip);

        ob.setAddress(address);
        ob2.setAddress(address);
        ob3.setAddress(address);

        addCustomer(ob);
        addCustomer(ob2);
        addCustomer(ob3);

        //customer.assignTrip(trip);
        //customer.setAddress(address);

        //System.out.println(customer.getInfo());

        showTable();

    }

    public static void addCustomer(Customer customer){

        if(customerCount + 1 > tab.length){

            Customer[] tablica = new Customer[customerCount + 1];
            for(int i = 0; i < tab.length; i++){
                tablica[i] = tab[i];

            }

            tab = tablica;
        }

        tab[customerCount] = customer;
        customerCount++;
    }


    public static void showTable () {

        for (int i = 0; i<tab.length;i++){
            System.out.println("Elementy w tablicy \n"+tab[i].getInfo());
        }
        System.out.println(customerCount);
    }
}