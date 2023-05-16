package behavior.strategy.bean;

public class Toff extends Person {


    public Toff(String name) {
        super(name);
    }

    @Override
    public void callNumber() {
        System.out.println("我是土豪，不用排队");
    }

    @Override
    public void transact() {
        System.out.println("土豪正在办理业务");
    }

    @Override
    public void leave() {
        System.out.println("土豪潇洒的离开了");
    }
}
