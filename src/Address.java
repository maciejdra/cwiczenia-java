public class Address {

    String street;
    String zip;
    String city;

    public Address(String street, String zip, String city){

        this.street = street;
        this.city = city;
        this.zip = zip;

    }

    public String getInfo (){

        return "Street " +street+ " City " +city+ " Zip " +zip;
    }

}