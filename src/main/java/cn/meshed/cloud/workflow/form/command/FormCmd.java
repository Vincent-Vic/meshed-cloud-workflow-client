package cn.meshed.cloud.workflow.form.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>表单模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "表单模型")
public class FormCmd extends Command {

    /**
     * ID
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 表单名称
     */
    @Schema(description = "表单名称")
    @NotBlank(message = "表单名称不能为空")
    private String name;

    /**
     * 表单key
     */
    @Schema(description = "表单key")
    @NotBlank(message = "表单key不能为空")
    private String key;

    /**
     * 表单描述
     */
    @Schema(description = "表单描述")
    private String description;

}
