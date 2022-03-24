package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.converter.ForestConverter;
import com.dtflys.forest.utils.ForestDataType;

import java.lang.reflect.Type;
import java.nio.charset.Charset;

/**
 * https://forest.dtflyx.com/docs/basic/converter#%E8%87%AA%E5%AE%9A%E4%B9%89%E8%BD%AC%E6%8D%A2%E5%99%A8
 *
 * @author AllinProgram
 * @since 2022-03-25 00:54 星期五
 */
public class YuqueResponseConvert implements ForestConverter {

    @Override
    public Object convertToJavaObject(Object o, Type type) {
        return null;
    }

    @Override
    public Object convertToJavaObject(byte[] bytes, Class aClass, Charset charset) {
        return null;
    }

    @Override
    public Object convertToJavaObject(byte[] bytes, Type type, Charset charset) {
        return null;
    }

    @Override
    public ForestDataType getDataType() {
        return null;
    }
}
