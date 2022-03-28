package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户信息DTO
 *
 * @author AllinProgram
 * @since 2022-03-11 15:41 星期五
 */
@Getter
@Setter
public class UserDTO extends BaseDTO {

    /**
     * 企业空间编号
     */
    @JSONField(name = "space_id")
    private Integer spaceId;
    /**
     * 用户账户编号
     */
    @JSONField(name = "account_id")
    private Integer accountId;
    /**
     * 类型：User用户、Group团队
     */
    private String type;
    /**
     * 用户个人路径
     */
    private String login;
    /**
     * 昵称
     */
    private String name;
    /**
     *团队创建人，仅适用于 type - 'Group'
     */
    @JSONField(name = "owner_id")
    private Integer ownerId;
    /**
     * 仓库数量
     */
    @JSONField(name = "books_count")
    private Integer booksCount;
    /**
     * 公开仓库数量
     */
    @JSONField(name = "public_books_count")
    private Integer publicBooksCount;
    /**
     * 团队成员数量
     */
    @JSONField(name = "members_count")
    private Integer membersCount;
    /**
     * 头像URL
     */
    @JSONField(name = "avatar_url")
    private String avatarUrl;
    /**
     * 描述
     */
    private String description;
}
