package com.gofirst.user.test;

import org.junit.Test;
import org.springframework.util.DigestUtils;

/**
 * @author : KKQ  2022/11/3 0003 15:58 我是中国人，我爱自己的祖国
 * @apiNote : 测试
 **/
public class UserTest {
    
    @Test
    public void test01(){
        System.out.println(DigestUtils.md5DigestAsHex(("123abc" + "123abc").getBytes()));  
    }
}
