package cn.meshed.cloud.workflow.form.command;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>表单数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "表单数据模型")
public class FormSchemaCmd {

    /**
     * ID
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 表单设计数据
     */
    @Schema(description = "表单设计数据")
    @NotBlank(message = "表单设计数据不能为空")
    private String schema;
}
