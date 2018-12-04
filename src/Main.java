import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rzut = new Random();
        int wynik = rzut.nextInt(6)+1;
        System.out.println(wynik);
    }
}
