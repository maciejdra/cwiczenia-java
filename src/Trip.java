public class Trip {

    public Date start;
    public Date end;
    String destination;

    public Trip (Date start, Date end, String destination){

        this.start = start;
        this.end = end;
        this.destination = destination;

    }

    public String getInfo (){

        return " Start " +start.getInfo()+ " end " +end.getInfo()+ "Destination "+destination;
    }
}