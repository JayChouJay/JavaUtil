package create.factory;

import create.factory.bean.*;
import create.factory.bean.impl.Cock;
import create.factory.bean.impl.Dinosaur;
import create.factory.bean.impl.Robot;
import create.factory.bean.impl.Spaceship;
import create.factory.factorymethod.ToyFactoryInterface;
import create.factory.factorymethod.impl.CockFactory;
import create.factory.factorymethod.impl.DinosaurFactory;
import create.factory.factorymethod.impl.RobotFactory;
import create.factory.factorymethod.impl.SpaceshipFactory;
import create.factory.staticfactory.ToyFactory;
import org.junit.jupiter.api.Test;


public class FactoryTest {
    @Test
    public void common() {
        //恐龙玩具
        Toy dinosaur = new Dinosaur();
        dinosaur.play();
        //机器人玩具
        Toy robot = new Robot();
        robot.play();
        //飞船玩具
        Toy spaceship = new Spaceship();
        spaceship.play();
        //公鸡玩具
        Toy cock = new Cock();
        cock.play();
    }

    /**
     * 静态工厂/简单工厂
     */
    @Test
    public void staticFactory() {
        Toy robot = ToyFactory.createToy("robot");
        robot.play();
        Toy spaceship = ToyFactory.createToy("spaceship");
        spaceship.play();
        Toy dinosaur = ToyFactory.createToy("dinosaur");
        dinosaur.play();
        Toy cock = ToyFactory.createToy("cock");
        cock.play();

    }

    /**
     * 工厂方法
     * 缺点：不知道实际实现类，增加业务复杂程度
     */
    @Test
    public void factoryMethod() {
        ToyFactoryInterface robotFactory=new RobotFactory();
        Toy robot = robotFactory.createToy();
        robot.play();

        ToyFactoryInterface dinosaurFactory=new DinosaurFactory();
        Toy dinosaur = dinosaurFactory.createToy();
        dinosaur.play();

        ToyFactoryInterface spaceshipFactory=new SpaceshipFactory();
        Toy spaceship = spaceshipFactory.createToy();
        spaceship.play();

        ToyFactoryInterface cockFactory=new CockFactory();
        Toy cock = cockFactory.createToy();
        cock.play();
    }
}
