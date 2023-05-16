package create.factory.factorymethod;

import create.factory.bean.Toy;

//定义玩具工厂接口
public interface ToyFactoryInterface {
    //定义创建玩具的方法
    Toy createToy();
}
