package com.allinprogram.yuqueblog.common;

/**
 * 静态属性
 *
 * @author AllinProgram
 * @since 2022-02-27 11:30 星期日
 */
public class Constant {

    public static String USERNAME;

    public static final class YuQueApi {

        public static final String BASE = "https://www.yuque.com/api/v2/";
        public static final String USER = BASE + "/users/" + USERNAME;
        public static final String GROUP = USER + "/groups";
        public static final String DOC = BASE + "/repos/" + USERNAME + "/docs";
    }
}
