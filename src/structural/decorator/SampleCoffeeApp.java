package structural.decorator;

public class SampleCoffeeApp {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription());

        Beverage myCustomTastyCoffee = AddonDecorator.getBuilder(new Espresso()).withAddon(new Espresso())
                                                                                .withAddon(new SoyMilk())
                                                                                .withAddon(new Honey()).build();
        System.out.println(myCustomTastyCoffee);
        Beverage somethingMoreUnusual = AddonDecorator.getBuilder(myCustomTastyCoffee).withAddon(new Decaf()).build();
        System.out.println(somethingMoreUnusual);
    }
}
