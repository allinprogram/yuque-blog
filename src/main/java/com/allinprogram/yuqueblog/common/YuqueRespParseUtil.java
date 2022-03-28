package com.allinprogram.yuqueblog.common;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author AllinProgram
 * @since 2022-03-29 00:09 星期二
 */
public class YuqueRespParseUtil {
    public static<T> T parse(String resp, Class<T> aimObject) {
        String dataJson = JSONObject.parseObject(resp).get("data").toString();
        return JSONObject.parseObject(dataJson, aimObject);
    }

    public static<T> List<T> parseList(String resp, Class<T> aimObject) {
        String dataJson = JSONObject.parseObject(resp).get("data").toString();
        return JSONObject.parseArray(dataJson, aimObject);
    }
}
