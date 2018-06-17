package creational.singleton;

public class LazySingletonDoubleCheckedLocking {
    private static volatile LazySingletonDoubleCheckedLocking instance;

    private LazySingletonDoubleCheckedLocking() {
    }

    //more or less ok implementation
    public static synchronized LazySingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new LazySingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
