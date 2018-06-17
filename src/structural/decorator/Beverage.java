package structural.decorator;

import java.math.BigDecimal;

public abstract class Beverage {
    public String getDescription() {
        return "a " + this.getClass().getSimpleName();
    }

    public abstract BigDecimal getCost();

    @Override
    public String toString() {
        return getDescription() + " | cost: " + getCost();
    }
}
