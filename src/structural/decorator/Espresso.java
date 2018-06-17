package structural.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    private final BigDecimal cost = BigDecimal.valueOf(2.75).setScale(2);

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
