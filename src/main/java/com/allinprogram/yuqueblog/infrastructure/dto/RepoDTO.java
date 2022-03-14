package com.allinprogram.yuqueblog.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 知识库DTO
 *
 * @author AllinProgram
 * @since 2022-03-11 15:47 星期五
 */
@Getter
@Setter
public class RepoDTO extends BaseDTO{

    /**
     * 类型：Book文档
     */
    private String type;
    /**
     * 仓库路径
     */
    private String slug;
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
    private String user_id;
    /**
     *
     */
    private UserDTO user;
    /**
     * 介绍
     */
    private String description;
    /**
     * 创建人User Id
     */
    private String creator_id;
    /**
     * 公开状态[1公开、0私密]
     */
    private Integer isPublic;
}
