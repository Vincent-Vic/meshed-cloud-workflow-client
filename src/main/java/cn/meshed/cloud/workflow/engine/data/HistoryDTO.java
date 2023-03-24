package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class HistoryDTO extends DTO {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 历史名称
     */
    @Schema(description = "历史名称")
    private String name;

    /**
     * 任务详情
     */
    @Schema(description = "任务详情")
    private String description;

    /**
     * 所有人
     */
    @Schema(description = "所有人")
    private String owner;

    /**
     * 分配人
     */
    @Schema(description = "分配人")
    private String assignee;

    /**
     * 流程实例编码
     */
    @Schema(description = "流程实例编码")
    private String processInstanceId;

    /**
     *
     */
    @Schema(description = "流程定义编码")
    private String processDefinitionId;

    /**
     * 发起时间
     */
    @Schema(description = "发起时间")
    private Date createTime;

    /**
     *
     */
    @Schema(description = "过期时间")
    private Date dueDate;

    /**
     * 分类
     */
    @Schema(description = "分类")
    private String category;

    /**
     * 表单key
     */
    @Schema(description = "表单key")
    private String formKey;

    /**
     * 任务临时变量
     */
    @Schema(description = "任务临时变量")
    private Map<String, Object> taskLocalVariables;

    /**
     * 流程变量
     */
    @Schema(description = "流程变量")
    private Map<String, Object> processVariables;

    /**
     * 运行时间
     */
    @Schema(description = "运行时间")
    private Date claimTime;

    /**
     * 删除原因
     */
    @Schema(description = "删除原因")
    private String deleteReason;

    /**
     * 结束时间
     */
    @Schema(description = "结束时间")
    private Date endTime;

    /**
     * 持续时间（毫秒）
     */
    @Schema(description = "持续时间（毫秒）")
    private Long durationInMillis;

    /**
     * 工作时间（单位：毫秒）
     */
    @Schema(description = "工作时间（单位：毫秒）")
    private Long workTimeInMillis;
}
