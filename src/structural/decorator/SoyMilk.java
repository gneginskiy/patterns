package structural.decorator;

import java.math.BigDecimal;

public class SoyMilk extends Beverage {
    private final BigDecimal cost = BigDecimal.valueOf(1).setScale(2);

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
