package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * 文档基本信息，一般用在列表场景
 *
 * @author AllinProgram
 * @since 2022-03-14 23:18 星期一
 */
@Getter
@Setter
public class DocDTO extends BaseDTO {

    /**
     * 文档路径
     */
    private String slug;
    /**
     * 标题
     */
    private String title;
    /**
     * 文档创建人user_id
     */
    @JSONField(name = "user_id")
    private String userId;
    /**
     * 描述了正文的格式[asl,markdown]
     */
    private String format;
    /**
     * 是否公开[1-公开,0-私密]
     */
    @JSONField(name = "public")
    private String isPublic;
    /**
     * 状态[1-正常,0-草稿]
     */
    private String status;
    /**
     * 喜欢数量
     */
    @JSONField(name = "likes_count")
    private String likesCount;
    /**
     * 评论数量
     */
    @JSONField(name = "comments_count")
    private String commentsCount;
    /**
     * 文档内容更新时间
     */
    @JSONField(name = "content_updated_at")
    private String contentUpdatedAt;
    /**
     * <BookSerializer>所属知识库
     */
    private RepoDTO book;
    /**
     * 所属团队（个人）
     */
    private UserDTO user;
    /**
     * 最后修改人
     */
    private UserDTO last_editor;
}
