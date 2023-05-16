package create.abstractfactroy.factory.impl;

import create.abstractfactroy.bean.ElectricalAppliance;
import create.abstractfactroy.bean.impl.HaiErAirConditioner;
import create.abstractfactroy.bean.impl.HaiErRefrigerator;
import create.abstractfactroy.bean.impl.HaiErTelevision;
import create.abstractfactroy.factory.ElectricalApplianceFactory;
//海尔电器工厂类
public class HaierElectricalApplianceFactory implements ElectricalApplianceFactory {
    /**
     * 创建海尔冰箱
     * @return
     */
    @Override
    public ElectricalAppliance createRefrigerator() {
        return new HaiErRefrigerator();
    }
    /**
     *创建海尔空调
     * @return
     */
    @Override
    public ElectricalAppliance createAirConditioner() {
        return new HaiErAirConditioner();
    }
    /**
     * 创建海尔电视
     * @return
     */
    @Override
    public ElectricalAppliance createTelevision() {
        return new HaiErTelevision();
    }
}
