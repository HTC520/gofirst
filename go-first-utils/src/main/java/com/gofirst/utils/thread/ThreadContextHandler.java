package com.gofirst.utils.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : KKQ  2022/11/3 0003 11:51 我是中国人，我爱自己的祖国
 * @apiNote :
 **/
public class ThreadContextHandler {
    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    private static final String CONTEXT_KEY_TOKEN = "context_key_token";

    private static final String CONTEXT_KEY_USER = "context_key_user";

    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    public static Object get(String key) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        return map.get(key);
    }
    
    public static void remove() {
        threadLocal.remove();
    }
}
