package creational.singleton;

public class LazySingletonViaHelper {
    private LazySingletonViaHelper() {
    }

    public static synchronized LazySingletonViaHelper getInstance() {
        return SingletonHelper.instance;
    }

    //somewhat lazy implementation :D
    private static class SingletonHelper {
        public static LazySingletonViaHelper instance = new LazySingletonViaHelper();
    }
}
