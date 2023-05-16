package create.factory.factorymethod.impl;

import create.factory.bean.Toy;
import create.factory.bean.impl.Cock;
import create.factory.bean.impl.Dinosaur;
import create.factory.factorymethod.ToyFactoryInterface;

//定义恐龙玩具工厂
public class DinosaurFactory implements ToyFactoryInterface {
    public Toy createToy(){
        return new Dinosaur();
    }
}
