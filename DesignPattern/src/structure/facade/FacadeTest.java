package structure.facade;

import org.junit.jupiter.api.Test;
import structure.facade.bean.CarFacade;
import structure.facade.bean.Door;
import structure.facade.bean.Engine;
import structure.facade.bean.Light;

public class FacadeTest {
    @Test
    public void commons() {
        //引擎
        Engine engine = new Engine();
        //车门
        Door door = new Door();
        //车灯
        Light light = new Light();

        //todo 开车需要进行的步骤
        System.out.println("开车需要进行的步骤==================");
        door.open();
        engine.start();
        light.turnOn();
        System.out.println();

        //todo 停车需要进行的步骤
        System.out.println("停车需要进行的步骤==================");
        light.turnOff();
        engine.stop();
        door.close();
        System.out.println();
    }

    @Test
    public void facadeTest() {
        CarFacade carFacade = new CarFacade();
        System.out.println("开车需要进行的步骤==================");
        carFacade.start();
        System.out.println("停车需要进行的步骤==================");
        carFacade.stop();
    }
}
