package structural.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

//I don't really think it's applicable to use a decorator pattern when we're dealing with the case like this.
//However, it was described in a book HeadFirst design patterns, and doesn't seem to be a violation of any principles
//but still, I would prefer to reflect this logic as a simple composition
public class AddonDecorator extends Beverage {
    public static final String DELIMITER = ", ";
    private final Beverage baseBeverage;
    private final Collection<Beverage> beverageAddons;

    private AddonDecorator(Beverage baseBeverage, Collection<Beverage> beverageAddons) {
        this.baseBeverage = baseBeverage;
        this.beverageAddons = Collections.unmodifiableCollection(new ArrayList<>(beverageAddons));
    }

    @Override
    public BigDecimal getCost() {
        BigDecimal beverageAddonsCost =
                beverageAddons.stream().reduce(BigDecimal.ZERO, (a, b) -> a.add(b.getCost()), BigDecimal::add);
        return baseBeverage.getCost().add(beverageAddonsCost).setScale(2);
    }

    @Override
    public String getDescription() {
        String description = baseBeverage.getDescription();
        if (beverageAddons.size() > 0) {
            String firstDelimiter = description.toLowerCase().contains("with") ? DELIMITER : " with ";
            description += firstDelimiter + beverageAddons.stream().map(Beverage::getDescription).collect(Collectors.joining(DELIMITER));
        }
        return description;
    }

    public static AddonDecoratorBuilder getBuilder(Beverage baseBeverage) {
        return new AddonDecoratorBuilder(baseBeverage);
    }

    public static class AddonDecoratorBuilder {
        private final Beverage baseBeverage;
        private final Collection<Beverage> beverageAddons;

        private AddonDecoratorBuilder(Beverage baseBeverage) {
            this.baseBeverage = baseBeverage;
            this.beverageAddons = new ArrayList<>();
        }

        public AddonDecoratorBuilder withAddon(Beverage addon) {
            beverageAddons.add(addon);
            return this;
        }

        public AddonDecorator build() {
            return new AddonDecorator(baseBeverage, beverageAddons);
        }
    }
}
