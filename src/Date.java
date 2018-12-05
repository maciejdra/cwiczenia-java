public class Date {

    int year, month, day;

    public  Date(){


    }

    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public void getInfo(){

        System.out.println("Rok " +year + " Miesiac " +month+ " Dzien " +day);

    }
}
