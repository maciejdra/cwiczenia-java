public class Date {

    private int year, month, day;

    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

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