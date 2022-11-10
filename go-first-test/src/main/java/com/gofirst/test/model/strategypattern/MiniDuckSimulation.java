package com.gofirst.test.model.strategypattern;

/**
 * @author : KKQ  2022/11/10 0010 17:32 我是中国人，我爱自己的祖国
 * @apiNote : 策略模式
 * 1.把会变化的部分取出并封装起来,好让其他部分不受影响
 * 2.针对接口编程而不是针对具体实现
 * 3.多用组合少用继承
 **/
public class MiniDuckSimulation {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        // 动态扩展, 不同的鸭子有不同的叫声, 但是可以通过扩展动态修改
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}