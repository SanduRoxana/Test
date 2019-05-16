package exemplu;

public class MySingleton2 { // thread- safe
    private static MySingleton2 singleton;

    private MySingleton2() {
    }

    public static MySingleton2 getInstance() { // am sincronizat toate apelurile ale metodei, dar vrem doar ca priimul apel sa fie sincronizat => latenta
        if(singleton == null) { // asigura ca doar primul apl ajunge la blocul sincronizat => eliminam botlle neck
            synchronized (MySingleton2.class) { // sincronizam doar primul apel
                if(singleton == null) { // pentru celelalte fire de executie care astepta sa intre in blocul sincronizat
                    singleton = new MySingleton2();
                }
            }
        }

        return singleton;
    }
}
