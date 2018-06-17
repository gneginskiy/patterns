package structural.decorator;

import java.math.BigDecimal;

public class Honey extends Beverage {
    private final BigDecimal cost = BigDecimal.valueOf(0.5).setScale(2);

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
