public class Main {

    public static void main(String[] args) {

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        Date today = new Date();

        today = start;

        start.getInfo();

        today.getInfo();

        today.year = 2016;
        today.day = 17;

        today.getInfo();
        start.getInfo();

        end = today;

        end.getInfo();
    }
}
