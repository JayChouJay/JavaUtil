package structure.decorate.bean;

import java.math.BigDecimal;

public class HerbalJelly implements MilkTea{
    @Override
    public String getDescription() {
        return "烧仙草";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(7.0);
    }
}
