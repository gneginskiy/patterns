package creational.singleton;

public class LazySingletonSynched {
    private static volatile LazySingletonSynched instance;

    private LazySingletonSynched() {
    }

    //low performance
    public static synchronized LazySingletonSynched getInstance() {
        if (instance == null) {
            instance = new LazySingletonSynched();
        }
        return instance;
    }
}
