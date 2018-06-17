package creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    //non-threadsafe implementation
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
