package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;

/**
 * <h1>任务传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "任务传输模型")
public class TaskDTO extends DTO {

    /**
     * 任务编码
     */
    @Schema(description = "任务编码")
    private String id;

    /**
     * 任务名称
     */
    @Schema(description = "任务名称")
    private String name;

    /**
     * 流程名称
     */
    @Schema(description = "流程名称")
    private String definitionName;

    /**
     * 描述
     */
    @Schema(description = "描述")
    private String description;

    /**
     * 所属人
     */
    @Schema(description = "所属人")
    private String owner;

    /**
     * 审批人
     */
    @Schema(description = "审批人")
    private String assignee;

    /**
     * 发起人
     */
    @Schema(description = "发起人")
    private String initiator;

    /**
     * 流程实例编码
     */
    @Schema(description = "流程实例编码")
    private String instanceId;

    /**
     * 执行编码
     */
    @Schema(description = "执行编码")
    private String executionId;

    /**
     * 流程定义编码
     */
    @Schema(description = "流程定义编码")
    private String definitionId;

    /**
     * 发起时间
     */
    @Schema(description = "发起时间")
    private Date createTime;

    /**
     * 过期时间
     */
    @Schema(description = "过期时间")
    private Date dueDate;

    /**
     * 表单key
     */
    @Schema(description = "表单key")
    private String formKey;

    /**
     * 任务局部参数
     */
    @Schema(description = "任务局部参数")
    private Map<String, Object> localVariables;

    /**
     * 过程参数
     */
    @Schema(description = "过程参数")
    private Map<String, Object> variables;

    /**
     * 运行时间
     */
    @Schema(description = "运行时间")
    private Date claimTime;
}
