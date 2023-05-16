package create.factory.bean.impl;

import create.factory.bean.Toy;

//定义恐龙实现类
public class Dinosaur implements Toy {
    @Override
    public void play() {
        System.out.println("Playing with 恐龙玩具");
    }
}
