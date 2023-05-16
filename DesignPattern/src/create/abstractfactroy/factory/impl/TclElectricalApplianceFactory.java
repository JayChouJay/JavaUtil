package create.abstractfactroy.factory.impl;

import create.abstractfactroy.bean.ElectricalAppliance;
import create.abstractfactroy.bean.impl.*;
import create.abstractfactroy.factory.ElectricalApplianceFactory;

//Tcl电器工厂类
public class TclElectricalApplianceFactory implements ElectricalApplianceFactory {
    /**
     * 创建Tcl冰箱
     * @return
     */
    @Override
    public ElectricalAppliance createRefrigerator() {
        return new TclRefrigerator();
    }
    /**
     *创建Tcl空调
     * @return
     */
    @Override
    public ElectricalAppliance createAirConditioner() {
        return new TclAirConditioner();
    }

    /**
     * 创建Tcl电视
     * @return
     */
    @Override
    public ElectricalAppliance createTelevision() {
        return new TclTelevision();
    }
}
