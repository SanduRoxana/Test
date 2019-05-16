package exemplu;

public class MySingleton {
    private static MySingleton singleton;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if(singleton == null) {
            singleton = new MySingleton();
        }
        return singleton;
    }
}
