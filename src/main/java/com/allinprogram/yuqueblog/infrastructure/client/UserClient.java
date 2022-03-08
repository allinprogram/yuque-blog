package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.Get;
import org.springframework.cache.annotation.Cacheable;

/**
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
    @Get("/users/iron-man/repos")
    String getRepos();
}
