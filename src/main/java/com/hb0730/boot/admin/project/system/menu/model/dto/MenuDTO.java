package com.hb0730.boot.admin.project.system.menu.model.dto;

import com.hb0730.boot.admin.domain.model.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 菜单
 *
 * @author bing_huang
 * @since 3.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MenuDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
    private String description;

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    @NotBlank(message = "名称不为空")
    private String title;

    /**
     * 英语名称
     */
    @NotBlank(message = "英文名称不为空")
    private String enname;

    /**
     * 父菜单id
     */
    @NotNull(message = "父id不为空")
    private Long parentId;

    /**
     * 路由地址
     */
    @NotBlank(message = "菜单地址不为空")
    private String path;

    /**
     * 组件地址
     */
    private String component;

    /**
     * 图标
     */
    private String icon;

    /**
     * 展示顺序
     */
    @Min(value = 0, message = "最小只能为0")
    @Max(value = 999, message = "最大为999")
    private Integer sort;
}
