package behavior.strategy;

import behavior.strategy.bean.Person;

public class Bank {

    public void profession(Person p){
        System.out.println(p.getName()+"客户进入银行啦");
        p.callNumber();
        p.transact();
        p.leave();
    }
}
