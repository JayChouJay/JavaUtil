package structure.facade.bean;

public class CarFacade {
    //引擎
    private Engine engine;
    //车门
    private Door door;
    //车灯
    private Light light;

    public CarFacade() {
        //初始化
        engine = new Engine();
        door = new Door();
        light = new Light();
    }

    public void start() {
        door.open();
        engine.start();
        light.turnOn();
    }

    public void stop() {
        light.turnOff();
        engine.stop();
        door.close();
    }
}
