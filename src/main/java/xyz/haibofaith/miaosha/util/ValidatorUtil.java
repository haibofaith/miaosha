package xyz.haibofaith.miaosha.util;

import org.springframework.util.StringUtils;

/**
 * @author:haibo.xiong
 * @date:2019/5/16
 * @description:
 */
public class ValidatorUtil {
    public static Boolean isMobile(String value){
        if (StringUtils.isEmpty(value)){
            return false;
        }
        if (value.length()!=11){
            return false;
        }
        return true;
    }
}
