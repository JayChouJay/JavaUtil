package behavior.strategy.bean;

public class YoungMan extends Person {

    public YoungMan(String name) {
        super(name);
    }
    @Override
    public void callNumber() {
        System.out.println("我是年轻人，排队叫号");
    }

    @Override
    public void transact() {
        System.out.println("年轻人正在办理业务");
    }

    @Override
    public void leave() {
        System.out.println("年轻人离开了");
    }
}