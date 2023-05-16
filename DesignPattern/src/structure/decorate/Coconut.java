package structure.decorate;

import structure.decorate.bean.MilkTea;

import java.math.BigDecimal;

/**
 * 椰果
 */
public class Coconut implements Condiment{
    private MilkTea milkTea;

    public Coconut(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + "，加椰果";
    }

    @Override
    public BigDecimal cost() {
        return milkTea.cost().add(new BigDecimal(2.0));
    }
}
