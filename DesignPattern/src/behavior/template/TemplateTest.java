package behavior.template;

import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    public void templateTest() {
        //创建一个程序员对象，调用模板方法，看看程序员的生活方式。
        Person programmer = new Programmer();
        programmer.live();
        //创建一个医生对象，调用模板方法，看看医生的生活方式。
        Person doctor = new Doctor();
        doctor.live();
        //创建一个篮球爱好者对象，调用模板方法，看看篮球爱好者的生活方式。
        Person basketballFan = new BasketballFan();
        basketballFan.live();
    }
}
