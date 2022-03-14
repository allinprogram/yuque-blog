package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * 文档详细信息
 *
 * @author AllinProgram
 * @since 2022-03-14 23:34 星期一
 */
@Getter
@Setter
public class DocDetailDTO {
    /**
     * 文档编号
     */
    private String id;
    /**
     * 文档路径
     */
    private String slug;
    /**
     * 标题
     */
    private String title;
    /**
     * 仓库编号，就是 repo_id
     */
    @JSONField(name = "book_id")
    private String bookId;
    /**
     * 仓库信息 <BookSerializer>，就是 repo 信息
     */
    private String book;
    /**
     * 用户/团队编号
     */
    @JSONField(name = "user_id")
    private Integer userId;
    /**
     * 用户/团队信息 <UserSerializer>
     */
    private UserDTO user;
    /**
     * 描述了正文的格式 [lake , markdown]
     */
    private String format;
    /**
     * 正文 Markdown 源代码
     */
    private String body;
    /**
     * 草稿 Markdown 源代码
     */
    @JSONField(name = "body_draft")
    private String bodyDraft;
    /**
     * 转换过后的正文 HTML （重大变更，详情请参考：https://www.yuque.com/yuque/developer/yr938f）
     */
    @JSONField(name = "body_html")
    private String bodyHtml;
    /**
     * 语雀 lake 格式的文档内容
     */
    @JSONField(name = "body_lake")
    private String bodyLake;
    /**
     * 文档创建人 User Id
     */
    @JSONField(name = "creator_id")
    private Integer creatorId;
    /**
     * 公开级别 [0 - 私密, 1 - 公开]
     */
    @JSONField(name = "public")
    private Integer isPublic;
    /**
     * 状态 [0 - 草稿, 1 - 发布]
     */
    private Integer status;
    /**
     * 赞数量
     */
    @JSONField(name = "likes_count")
    private Integer likesCount;
    /**
     * 评论数量
     */
    @JSONField(name = "comments_count")
    private Integer commentsCount;
    /**
     * 文档内容更新时间
     */
    @JSONField(name = "content_updated_at")
    private String contentUpdatedAt;
    /**
     * 删除时间，未删除为 null
     */
    @JSONField(name = "deleted_at")
    private String deletedAt;
}