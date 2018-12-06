import java.util.StringTokenizer;

public class Date {

    private int year, month, day;

    public Date(){

    }

    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public static Date checkString(String s, String div{
        StringTokenizer parser = new StringTokenizer(s);
        Date date = new Date();

        int counter = 0;

        while (parser.hasMoreTokens()){

            String token = parser.nextToken();

        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}