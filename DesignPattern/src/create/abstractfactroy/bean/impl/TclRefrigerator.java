package create.abstractfactroy.bean.impl;

import create.abstractfactroy.bean.ElectricalAppliance;
//TCL冰箱产品类
public class TclRefrigerator implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("TCL冰箱已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("TCL冰箱已关闭");
    }
}
