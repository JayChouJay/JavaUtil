package create.abstractfactroy.bean.impl;

import create.abstractfactroy.bean.ElectricalAppliance;
//海尔电视产品类
public class HaiErTelevision implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("海尔电视已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("海尔电视已关闭");
    }
}
