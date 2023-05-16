package create.factory.factorymethod.impl;

import create.factory.bean.Toy;
import create.factory.bean.impl.Dinosaur;
import create.factory.bean.impl.Robot;
import create.factory.factorymethod.ToyFactoryInterface;
//定义机器人玩具工厂
public class RobotFactory implements ToyFactoryInterface {
    public Toy createToy(){
        return new Robot();
    }
}
