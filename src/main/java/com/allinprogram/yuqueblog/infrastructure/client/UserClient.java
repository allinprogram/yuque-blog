package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import org.springframework.cache.annotation.Cacheable;

import static com.allinprogram.yuqueblog.common.Constant.YuQueApi.BASE;

/**
 * @author AllinProgram
 * @since 2022-03-08 17:03 星期二
 */
@BaseRequest(
        baseURL = BASE,
        headers = {
                "Content-Type: application/json",
                "User-Agent: yuque-blog",
                "X-Auth-Token: "
        }
)
public interface UserClient {

    @Cacheable("user")
    @Get("/user")
    String getUser();
}
