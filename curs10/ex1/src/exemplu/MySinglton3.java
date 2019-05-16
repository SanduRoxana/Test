package exemplu;

public class MySinglton3 { // thread-safe // toretic este mai rapida - foloseste o sincronizare nativa din masina virtuala

    private MySinglton3() {
    }

    private static class SingletonHolder { // classLoader incarca sincronizat cele 2 clase in perm gen
        private static final MySinglton3 singleton = new MySinglton3();
    }

    public static MySinglton3 getInstance() {
        return SingletonHolder.singleton;
    }
}
