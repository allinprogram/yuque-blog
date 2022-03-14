package com.allinprogram.yuqueblog.infrastructure.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import org.springframework.cache.annotation.Cacheable;

/**
 * 调用存储库相关API
 *
 * @author AllinProgram
 * @since 2022-03-08 19:16 星期二
 */
public interface RepoClient extends BaseClient {

    /**
     * 获取repo的文档列表
     */
    @Cacheable("docs")
    @Get("/repos/{repoId}/docs")
    String getDocs(@Var("repoId") String repoId);

    /**
     * 获取单篇文档的详细信息
     */
    @Cacheable("doc")
    @Get("/repos/{namespace}/docs/{slug}")
    String getDoc(@Var("namespace") String namespace, @Var("slug") String slug);
}
