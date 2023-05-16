package constructor.bean;

public class Person {
    public String name;

    public Person() {
        System.out.println("我是Person的无参构造方法");
    }

    public Person(String name) {
        this.name = name;
    }
}
