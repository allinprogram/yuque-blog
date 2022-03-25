package com.allinprogram.yuqueblog.infrastructure.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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
     * 路径
     */
    private String slug;
    /**
     * 创建时间
     */
    @JSONField(name = "created_at")
    private LocalDateTime createdAt;
    /**
     * 更新时间
     */
    @JSONField(name = "updated_at")
    private LocalDateTime updatedAt;
}
