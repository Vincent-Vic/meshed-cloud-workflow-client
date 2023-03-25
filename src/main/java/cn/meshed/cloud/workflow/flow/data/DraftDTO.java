package cn.meshed.cloud.workflow.flow.data;

import cn.meshed.cloud.workflow.flow.enums.FormTypeEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
     * 名称
     */
    @Schema(description = "表单类型")
    private FormTypeEnum formType;

    /**
     * 表单ID
     */
    @Schema(description = "表单ID（表单类型时必须存在）")
    private String formId;

    /**
     * 表单Url
     */
    @Schema(description = "表单HTTP（iframe类型时必须存在）")
    private String formUrl;

    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;
}
