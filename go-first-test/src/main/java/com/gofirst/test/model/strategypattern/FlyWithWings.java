package com.gofirst.test.model.strategypattern;

/**
 * @author : KKQ  2022/11/10 0010 17:22 我是中国人，我爱自己的祖国
 * @apiNote :飞行行为的实现, 这是会飞的
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞的鸭子!");
    }
}
