package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * 仓库的详细信息
 *
 * @author AllinProgram
 * @since 2022-03-14 23:12 星期一
 */
@Getter
@Setter
public class RepoDetailDTO extends BaseDTO {
    /**
     * 类型：Book文档
     */
    private String type;
    /**
     * 名称
     */
    private String name;
    /**
     * 仓库完整路径：{user.login}/book.slug
     */
    private String namespace;
    /**
     * 所属团队/用户编号
     */
    @JSONField(name = "user_id")
    private Integer userId;
    /**
     * User
     */
    private UserDTO user;
    /**
     * 目录原文
     */
    @JSONField(name = "toc_yml")
    private UserDTO tocYml;
    /**
     * 介绍
     */
    private String description;
    /**
     * 创建人User Id
     */
    @JSONField(name = "creator_id")
    private Integer creatorId;
    /**
     * 文档数量
     */
    @JSONField(name = "items_count")
    private Integer itemsCount;
    /**
     * 喜欢数量
     */
    @JSONField(name = "likes_count")
    private Integer likesCount;
    /**
     * 订阅数量
     */
    @JSONField(name = "watches_count")
    private Integer watchesCount;
}