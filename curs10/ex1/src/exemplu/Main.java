package exemplu;

public class Main {

    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance(); // nu este thread-safe
    }
}
