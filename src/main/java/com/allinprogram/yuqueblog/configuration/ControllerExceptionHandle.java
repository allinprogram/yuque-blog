package com.allinprogram.yuqueblog.configuration;

import com.allinprogram.yuqueblog.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller全局异常捕获
 *
 * @author AllinProgram
 * @since 2022-03-29 14:25 星期二
 */
// @ControllerAdvice
public class ControllerExceptionHandle {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e) {
        return Result.fail(e);
    }
}
