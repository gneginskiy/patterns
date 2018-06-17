package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Hello, I'm an enum singleton");
        System.out.println("I can't be broken with Reflection API");
        System.out.println("Also I can't be initialized in a lazy manner");
    }
}
