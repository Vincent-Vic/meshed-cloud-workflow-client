package cn.meshed.cloud.workflow.flow.data;

import cn.meshed.cloud.workflow.flow.enums.FormTypeEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>草稿传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "草稿传输模型")
public class DraftDTO extends DTO {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 分类
     */
    @Schema(description = "唯一值")
    private String key;

    /**
     * 分类
     */
    @Schema(description = "分类")
    private String category;

    /**
     * 流程名称
     */
    @Schema(description = "流程名称")
    private String name;


    /**
     * 版本
     */
    @Schema(description = "版本")
    private Integer version;


    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;

    /**
     * 归属系统
     */
    @Schema(description = "归属系统")
    private String tenantId;
}
