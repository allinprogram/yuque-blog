package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * 一般在列表的场景返回的仓库信息
 *
 * @author AllinProgram
 * @since 2022-03-11 15:47 星期五
 */
@Getter
@Setter
public class RepoDTO extends BaseDTO {

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
    private String userId;
    /**
     * User
     */
    private UserDTO user;
    /**
     * 介绍
     */
    private String description;
    /**
     * 创建人User Id
     */
    @JSONField(name = "creator_id")
    private String creatorId;
}