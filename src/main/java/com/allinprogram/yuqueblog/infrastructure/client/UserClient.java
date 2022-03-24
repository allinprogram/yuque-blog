package com.allinprogram.yuqueblog.infrastructure.client;

import com.allinprogram.yuqueblog.infrastructure.dto.UserDTO;
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
    // 这里自动转换存在问题，http响应结果不是单纯的dto结构
    UserDTO getUser();

    /**
     * 获取当前登录用户的所有repo
     */
    @Cacheable("repos")
    @Get("/users/{username}/repos")
    String getRepos(@Var("username")String username);
}
