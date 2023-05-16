package create.abstractfactroy.factory;

import create.abstractfactroy.bean.ElectricalAppliance;

//电器抽象工厂接口
public interface ElectricalApplianceFactory {
    //创建冰箱产品
    ElectricalAppliance createRefrigerator();

    //创建空调产品
    ElectricalAppliance createAirConditioner();

    //创建电视产品
    ElectricalAppliance createTelevision();
}
