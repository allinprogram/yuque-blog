package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import org.springframework.cache.annotation.Cacheable;

import static com.allinprogram.yuqueblog.common.Constant.YuQueApi.BASE;

/**
 * yuque api调用
 *
 * @author AllinProgram
 * @since 2022-03-29 14:38 星期二
 */
@BaseRequest(
        baseURL = BASE,
        contentType = "application/json",
        headers = {
                "User-Agent: yuque-blog",
                "X-Auth-Token: zahwaPQaQW9HfvsrLib9ldxdQdt1sbQggRIrXeaK"
        }
)
public interface YuqueApiClient {

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
    String getRepos(@Var("userId") Integer userId);

    @Cacheable("repo")
    @Get("/repos/{repoId}")
    String getRepo(@Var("repoId") Integer repoId);

    /**
     * 获取repo的文档列表
     */
    @Cacheable("docs")
    @Get("/repos/{repoId}/docs")
    String getDocs(@Var("repoId") Integer repoId);

    /**
     * 获取单篇文档的详细信息
     */
    @Cacheable("doc")
    @Get("/repos/{namespace}/docs/{slug}")
    String getDoc(@Var("namespace") String namespace, @Var("slug") String slug);
}
