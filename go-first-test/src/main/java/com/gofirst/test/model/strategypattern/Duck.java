package com.gofirst.test.model.strategypattern;

/**
 * @author : KKQ  2022/11/10 0010 17:06 我是中国人，我爱自己的祖国
 * @apiNote : 鸭子父类
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 不同的鸭子外观不一样
     */
    public abstract void display();

    public void swim() {
        System.out.println("所有的鸭子都会游泳~");
    }

    public void performFly() {
        /**
         * 委托给行为类
         */
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
