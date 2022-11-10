package com.gofirst.test.model.strategypattern;

/**
 * @author : KKQ  2022/11/10 0010 17:26 我是中国人，我爱自己的祖国
 * @apiNote :
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("静音的~");
    }
}
