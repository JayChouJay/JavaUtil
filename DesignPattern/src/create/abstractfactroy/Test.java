package create.abstractfactroy;

import create.abstractfactroy.bean.ElectricalAppliance;
import create.abstractfactroy.factory.ElectricalApplianceFactory;
import create.abstractfactroy.factory.impl.HaierElectricalApplianceFactory;
import create.abstractfactroy.factory.impl.TclElectricalApplianceFactory;

public class Test {
    @org.junit.jupiter.api.Test
    public void abstractFactory() {
        //创建HaiEr电器工厂对象
        ElectricalApplianceFactory haierFactory = new HaierElectricalApplianceFactory();
        //创建HaiEr冰箱、空调、电视
        ElectricalAppliance haierAirConditioner = haierFactory.createAirConditioner();
        ElectricalAppliance haierRefrigerator = haierFactory.createRefrigerator();
        ElectricalAppliance haierTelevision = haierFactory.createTelevision();
        //打开Haier冰箱、空调、电视
        haierAirConditioner.turnOn();
        haierRefrigerator.turnOn();
        haierTelevision.turnOn();
        System.out.println("=========海尔=========");
        //关闭Haier冰箱、空调、电视
        haierAirConditioner.turnOff();
        haierRefrigerator.turnOff();
        haierTelevision.turnOff();

        System.out.println("=========品牌分界线============");
        //创建TCL电器工厂对象
        ElectricalApplianceFactory tclFactory = new TclElectricalApplianceFactory();
        //创建TCL冰箱、空调、电视
        ElectricalAppliance tclAirConditioner = tclFactory.createAirConditioner();
        ElectricalAppliance tclRefrigerator = tclFactory.createRefrigerator();
        ElectricalAppliance tclTelevision = tclFactory.createTelevision();
        //打开TCL冰箱、空调、电视
        tclAirConditioner.turnOn();
        tclRefrigerator.turnOn();
        tclTelevision.turnOn();
        System.out.println("=========TCL=========");
        //关闭TCL冰箱、空调、电视
        tclAirConditioner.turnOff();
        tclRefrigerator.turnOff();
        tclTelevision.turnOff();

    }
}
