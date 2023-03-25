package cn.meshed.cloud.workflow.flow.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>设计保存</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "设计保存")
public class DesignerCmd extends Command {

    /**
     * 流程ID
     */
    @Schema(description = "流程ID")
    @NotBlank(message = "流程ID不能为空")
    private String flowId;

    /**
     * 流程设计图
     */
    @Schema(description = "流程设计图")
    @NotBlank(message = "流程设计图不能为空")
    private String graph;
}
