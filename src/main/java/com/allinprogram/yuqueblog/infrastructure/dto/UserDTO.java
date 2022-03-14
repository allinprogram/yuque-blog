package com.allinprogram.yuqueblog.infrastructure.dto;

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
     * 描述
     */
    private String description;
    /**
     * 头像URL
     */
    private String avatar_url;
}
