

package com.pineapple.system.common.utils;

/**
 * Redis所有Keys
 *
 * @author lyk
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }

    public static String getShiroSessionKey(String key){
        return "sessionid:" + key;
    }
}
