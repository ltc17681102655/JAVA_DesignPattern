package design.singleton;

public class Singleton2 {

    static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
            return instance;
        } else {
            return instance;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance()==Singleton2.getInstance());
    }
}
