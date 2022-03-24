package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.BaseRequest;

import static com.allinprogram.yuqueblog.common.Constant.YuQueApi.BASE;

/**
 * @author AllinProgram
 * @since 2022-03-09 00:21 星期三
 */
@BaseRequest(
        baseURL = BASE,
        contentType = "application/json",
        headers = {
                "User-Agent: yuque-blog",
                "X-Auth-Token: "
        }
)
public interface BaseClient {
}
