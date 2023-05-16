package structure.decorate;

import org.junit.jupiter.api.Test;
import structure.decorate.bean.BoBoMilkTea;
import structure.decorate.bean.HerbalJelly;
import structure.decorate.bean.MilkTea;

public class DecorateTest {
    @Test
    public void commons() {
        MilkTea boBoMilkTea = new BoBoMilkTea();
        System.out.println("饮料名称：" + boBoMilkTea.getDescription() + "    价格：" + boBoMilkTea.cost());

        MilkTea herbalJelly = new HerbalJelly();
        System.out.println("饮料名称：" + herbalJelly.getDescription() + "    价格：" + herbalJelly.cost());

    }

    @Test
    public void decorateTest() {
        MilkTea boBoMilkTea = new BoBoMilkTea();
        boBoMilkTea = new Pearl(boBoMilkTea);
        boBoMilkTea = new Coconut(boBoMilkTea);
        System.out.println("饮料名称：" + boBoMilkTea.getDescription() + "   价格：" + boBoMilkTea.cost());

        MilkTea hervalJelly=new HerbalJelly();

        hervalJelly=new Pearl(hervalJelly);
        hervalJelly=new Coconut(hervalJelly);
        hervalJelly=new Ormosia(hervalJelly);
        System.out.println("饮料名称：" + hervalJelly.getDescription() + "   价格：" + hervalJelly.cost());
    }
}
