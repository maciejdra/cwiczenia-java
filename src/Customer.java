public class Customer {

    String name;
    public Address address;
    public Trip trip;

    public Customer(String name){

        this.name = name;

    }

    public void setAddress(Address address){

        this.address = address;

    }

    public void assignTrip(Trip trip){

        this.trip = trip;

    }

    public String getInfo(){

        return "Name "+name+ " Adress " +address.getInfo()+ " Trip" +trip.getInfo();
    }
}