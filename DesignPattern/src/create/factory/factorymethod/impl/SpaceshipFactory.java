package create.factory.factorymethod.impl;

import create.factory.bean.Toy;
import create.factory.bean.impl.Cock;
import create.factory.bean.impl.Spaceship;
import create.factory.factorymethod.ToyFactoryInterface;
//定义宇宙飞船玩具工厂
public class SpaceshipFactory implements ToyFactoryInterface {
    public Toy createToy(){
        return new Spaceship();
    }
}
