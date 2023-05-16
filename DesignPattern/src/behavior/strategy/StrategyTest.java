package behavior.strategy;

import behavior.strategy.bean.OldMan;
import behavior.strategy.bean.Person;
import behavior.strategy.bean.Toff;
import behavior.strategy.bean.YoungMan;
import org.junit.jupiter.api.Test;

/**
 * 模板模式
 * 应用：spring整合其他框架（Templates）如，redis，JDBC
 */
public class StrategyTest {
    @Test
    public void strategyTest() {
        Bank bank = new Bank();
        Person oldMan = new OldMan("长者");
        Person youngMan = new YoungMan("年轻人");
        Person toff = new Toff("土豪");
        bank.profession(oldMan);
        bank.profession(youngMan);
        bank.profession(toff);
    }
}
