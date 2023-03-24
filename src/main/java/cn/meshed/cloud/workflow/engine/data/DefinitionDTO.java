package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <h1>流程定义</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class DefinitionDTO extends DTO {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 分类
     */
    @Schema(description = "分类")
    private String category;

    /**
     * 名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * 标识
     */
    @Schema(description = "标识")
    private String key;

    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;

    /**
     * 版本
     */
    @Schema(description = "版本")
    private Integer version;

    /**
     * 部署编码
     */
    @Schema(description = "部署编码")
    private String deploymentId;

    /**
     * 是否存在挂载表单
     */
    @Schema(description = "是否存在挂载表单")
    private Boolean hasStartFormKey;

    /**
     * 是否挂起
     */
    @Schema(description = "是否挂起")
    private Boolean isSuspended;

}
