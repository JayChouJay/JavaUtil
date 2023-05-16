package behavior.template;

/**
 * 定义一个人类抽象类，表示一个人的生活方式
 */
public abstract class Person {
    //定义一个模板方法，表示一个人的生活方式
    public final void live() {
        wakeup();
        behavior();
        sleep();
    }
    //定义一个起床方法，表示所有人起床的方式是一样的
    public void wakeup(){
        System.out.println("起床。。。。。。。。。。");
    }
    //定义一个抽象方法，表示每个人的行为是不同的，需要由具体子类实现
    public abstract void behavior();
    //定义一个睡觉方法，表示所有人睡觉的方式是一样的
    public  void sleep(){
        System.out.println("睡觉。。。。。。。");
    }
}
