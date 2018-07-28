package com.strong.fee.util.util;

import com.google.gson.Gson;

/**
 * author: 小殊
 * create: 2018/7/28 下午5:05
 */
public class GsonUtil {
    private static final Gson gson = new Gson();

    public static <T> String toJson(T obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> clz) {
        return gson.fromJson(json, clz);
    }
}
