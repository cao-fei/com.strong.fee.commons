package com.strong.fee.util.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * author: 小殊
 * create: 2018/7/28 下午6:09
 */
public class FastJsonUtil {

    public static <T> String toJson(T obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T fromJson(String json, Class<T> clz) {
        return JSON.parseObject(json, clz);
    }

    public static <T> List<T> fromJsonToList(String json, Class<T> clz) {
        return JSON.parseArray(json, clz);
    }

    public static <T> T fromJson(String json, TypeReference<T> typeReference) {

        return JSON.parseObject(json, typeReference);
    }
}
