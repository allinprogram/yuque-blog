package com.allinprogram.yuqueblog.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author AllinProgram
 * @since 2022-03-11 15:56 星期五
 */
@Getter
@Setter
public class BaseDTO {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 创建时间
     */
    private String created_at;
    /**
     * 更新时间
     */
    private String updated_at;
}
