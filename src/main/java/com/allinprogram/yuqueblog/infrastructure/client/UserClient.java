package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import org.springframework.cache.annotation.Cacheable;

/**
 * 调用用户相关API
 *
 * @author AllinProgram
 * @since 2022-03-08 17:03 星期二
 */
public interface UserClient extends BaseClient {

    /**
     * 获取当前用户的身份信息
     */
    @Cacheable("user")
    @Get("/user")
    String getUser();

    /**
     * 获取当前登录用户的所有repo
     */
    @Cacheable("repos")
    @Get("/users/{userId}/repos")
    String getRepos(@Var("userId")Integer userId);
}
