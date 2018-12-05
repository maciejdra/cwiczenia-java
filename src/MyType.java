public class MyType {

    static {

        System.out.println("Blok statyczny");
    }

    public MyType(){
        System.out.println("Konstruktor");
    }

    {
        System.out.println("Zwykly blok");
    }
}
