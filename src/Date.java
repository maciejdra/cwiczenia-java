public class Date {

    int year, month, day;

    public  Date(){

    }

    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public String getInfo(){

        return " " +year+ " " +month+ " " +day+ " ";

    }
}