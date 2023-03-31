package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * <h1>完成任务</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "完成任务")
public class CompleteTaskCmd extends Command {

    /**
     * 任务编码
     */
    @Schema(description = "任务编码")
    @NotBlank(message = "任务编码不能为空")
    private String taskId;
    /**
     * 实例编码
     */
    @Schema(description = "实例编码")
    @NotBlank(message = "实例编码不能为空")
    private String instanceId;
    /**
     * 携带参数
     */
    @Schema(description = "携带参数")
    private Map<String, Object> param;
    /**
     * 携带信息
     */
    @Schema(description = "携带信息")
    @NotBlank(message = "携带信息不能为空")
    private String message;

}
