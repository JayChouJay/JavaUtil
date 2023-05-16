package create.factory.factorymethod.impl;

import create.factory.bean.impl.Cock;
import create.factory.bean.Toy;
import create.factory.factorymethod.ToyFactoryInterface;

//定义公鸡玩具工厂
public class CockFactory implements ToyFactoryInterface {
    public Toy createToy(){
        return new Cock();
    }
}
