package create.factory.staticfactory;

import create.factory.bean.*;
import create.factory.bean.impl.Cock;
import create.factory.bean.impl.Dinosaur;
import create.factory.bean.impl.Robot;
import create.factory.bean.impl.Spaceship;

//定义玩具工厂类
public class ToyFactory {
    //静态方法创建不同类型的玩具对象
    public static Toy createToy(String type) {
        if (type.equalsIgnoreCase("robot")) {
            return new Robot();
        } else if (type.equalsIgnoreCase("spaceship")) {
            return new Spaceship();

        } else if (type.equalsIgnoreCase("dinosaur")) {
            return new Dinosaur();

        } else if (type.equalsIgnoreCase("cock")) {
            return new Cock();

        } else {
            return null;
        }
    }
}