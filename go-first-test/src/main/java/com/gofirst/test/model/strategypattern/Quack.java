package com.gofirst.test.model.strategypattern;

/**
 * @author : KKQ  2022/11/10 0010 17:25 我是中国人，我爱自己的祖国
 * @apiNote :
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫~");
    }
}
