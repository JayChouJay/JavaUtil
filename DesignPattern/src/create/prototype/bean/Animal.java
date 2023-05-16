package create.prototype.bean;

/**
 * 定义一个动物类
 */
public class Animal implements Cloneable {
    private String type;
    private Object obj;

    public Animal(String type) {
        this.type = type;
        obj = new Object();
        System.out.println("创建了一只" + type);
    }

    public void speak() {
        System.out.println(type + "正在叫...你干嘛！！！！" + obj);
    }

    public Animal clone() throws CloneNotSupportedException {
        System.out.println(type + "正在被克隆。。。");
        return (Animal) super.clone();
    }
}
