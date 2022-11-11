package com.gofirst.test.model.strategypattern;

import java.util.HashMap;

/**
 * @author : KKQ  2022/11/11 0011 13:38 我是中国人，我爱自己的祖国
 * @apiNote : 使用简单工厂去掉if else 的判断
 **/
public class QuackFactory {
    private static HashMap<String, QuackBehavior> QUACK_MAP = new HashMap<>();

    static {
        QUACK_MAP.put(QuackKey.QUACK, new Quack());
        QUACK_MAP.put(QuackKey.SQUEAK, new Squeak());
        QUACK_MAP.put(QuackKey.MUTE_QUACK, new MuteQuack());
    }

    private interface QuackKey {
        String QUACK = "QUACK";
        String SQUEAK = "SQUEAK";
        String MUTE_QUACK = "METE_QUACK";
    }

    private QuackFactory() {
        //把这个变成一个单例
    }

    /**
     * 默认给嘎嘎叫~
     */
    private static final QuackBehavior QUACK_BEHAVIOR = new Quack();

    public static QuackBehavior getQuackBehavior(String quackKey) {
        return QUACK_MAP.get(quackKey) == null ? QUACK_BEHAVIOR : QUACK_MAP.get(quackKey);
    }
}
