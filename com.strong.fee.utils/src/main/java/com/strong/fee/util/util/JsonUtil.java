package com.strong.fee.util.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author: 小殊
 * create: 2018/7/28 下午6:30
 */
public class JsonUtil {

    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    /**
     * 把对象转换成Json字符串
     *
     * @param <T> the type parameter
     * @param obj 对象
     * @return json字符串 string
     */
    public static <T> String toJson(T obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json;
        try {
            json = mapper.writeValueAsString(obj);
        } catch (Exception e) {
            logger.warn(e.getMessage());
            json = "";
        }
        return json;
    }

    /**
     * 把Json字符串转换成对象,Map,List
     *
     * @param <T>  the type parameter
     * @param json json字符串
     * @param c    类型
     * @return t t
     */
    public static <T> T fromJson(String json, Class<T> c) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, c);
        } catch (Exception e) {
            logger.warn("json" + json + ",class+" + c.getName() + "," + e.getMessage());
            return null;
        }
    }

    /**
     * 把Json字符串转换成对象List
     *
     * @param <T>  the type parameter
     * @param json the json
     * @param t    the t
     * @return list list
     */
    public static <T> T fromJson(String json, TypeReference<T> t) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, t);
        } catch (Exception e) {
            logger.warn(e.getMessage());
            return null;
        }
    }

}
