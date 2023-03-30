package cn.meshed.cloud.workflow.engine.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "任务分页查询")
public class TaskActivityQry {

    /** 名称 */
    @Schema(description = "任务ID")
    private String taskId;

    /** 名称 */
    @Schema(description = "实例ID")
    private String instanceId;
}
