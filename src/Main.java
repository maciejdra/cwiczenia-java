public class Main {

    public void changeValue(Value val ){
        val.x = 10;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Value wartosc = new Value();
        wartosc.x = 5;
        t.changeValue(wartosc);
        System.out.println(wartosc.x);
    }

    static class Value{
        int x;
    }
}
