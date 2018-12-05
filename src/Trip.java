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

        //String info = start.getInfo()+end.getInfo() + "Destination"+destination;
        return "Start " +start.getInfo()+ " end " +end.getInfo()+ "Destination "+destination;
        //return info;
    }
}
