package creational.singleton;

public class EagerSingleton {
    //can't pass parameters, may be not necessary  for your app
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
