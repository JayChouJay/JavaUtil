package behavior.strategy.bean;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //叫号方法
    public abstract void callNumber();
    //办理业务方法
    public abstract void transact();
    //离开方法
    public abstract void leave();
}
