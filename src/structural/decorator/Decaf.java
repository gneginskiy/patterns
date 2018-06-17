package structural.decorator;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    private final BigDecimal cost = BigDecimal.valueOf(2.99).setScale(2);

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
