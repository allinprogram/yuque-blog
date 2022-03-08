package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.BaseRequest;

import static com.allinprogram.yuqueblog.common.Constant.YuQueApi.BASE;

/**
 * @author AllinProgram
 * @since 2022-03-09 00:21 星期三
 */
@BaseRequest(
        baseURL = BASE,
        headers = {
                "Content-Type: application/json",
                "User-Agent: yuque-blog",
                "X-Auth-Token: 9W90xI9QzhUY9UXGGJn4YRCPCzH3bKxcRuNxRn1I"
        }
)
public interface BaseClient {
}
