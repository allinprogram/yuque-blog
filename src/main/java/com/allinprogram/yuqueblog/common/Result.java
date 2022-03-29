package com.allinprogram.yuqueblog.common;

/**
 * @author AllinProgram
 * @since 2022-03-29 14:27 星期二
 */
public class Result<T> {

    private Boolean status;

    private String message;

    private T data;

    public static<T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.status = true;
        result.data = data;
        return result;
    }

    public static<T> Result<T> fail(Exception e) {
        Result<T> result = new Result<>();
        result.status = false;
        result.message = e.getMessage();
        return result;
    }
}
