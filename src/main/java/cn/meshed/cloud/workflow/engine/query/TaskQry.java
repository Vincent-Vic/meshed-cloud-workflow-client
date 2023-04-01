package cn.meshed.cloud.workflow.engine.query;

import cn.meshed.cloud.workflow.engine.enums.ActiveStatusEnum;
import cn.meshed.cloud.workflow.engine.enums.TaskQueryTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * <h1>任务查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "任务查询")
public class TaskQry extends PageQuery {

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

}
