package create.prototype;

import create.prototype.bean.Animal;
import org.junit.jupiter.api.Test;

/**
 * 原型模式
 * 相关：浅拷贝和深拷贝
 */
public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Animal animal = new Animal("鸡哥");
        animal.speak();
        System.out.println("=============分割线================");
        //克隆原型对象创建新对象
        Animal animal2 = animal.clone();
        animal2.speak();
    }
}
