package com.alix.infosystem.common.utils;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 13:57
 */

public class StringUtil {

    public static boolean notEmpty(String arg){
        boolean isEmpty = true;
        if(null == arg || "".equals(arg)){
            isEmpty = false;
        }
        return isEmpty;
    }

}
