package structure.decorate.bean;

import java.math.BigDecimal;

/**
 * 奶茶
 */
public interface MilkTea {
    /**
     * 奶茶名称
     */
    String getDescription();

    /**
     * 售价
     */
    BigDecimal cost();

}
