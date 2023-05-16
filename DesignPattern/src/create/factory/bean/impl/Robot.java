package create.factory.bean.impl;

import create.factory.bean.Toy;

//定义机器人实现类
public class Robot implements Toy {

    @Override
    public void play() {
        System.out.println("Playing with 机器人玩具");
    }
}
