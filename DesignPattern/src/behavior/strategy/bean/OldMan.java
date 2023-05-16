package behavior.strategy.bean;

public class OldMan extends Person {

    public OldMan(String name) {
        super(name);
    }
    @Override
    public void callNumber() {
        System.out.println("我是老年人，我要排队");
    }

    @Override
    public void transact() {
        System.out.println("老年人正在办理业务");
    }

    @Override
    public void leave() {
        System.out.println("老年人慢慢的离开了");
    }
}
