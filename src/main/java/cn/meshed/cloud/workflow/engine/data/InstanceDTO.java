package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;

/**
 * <h1>流程实例模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "流程实例模型")
public class InstanceDTO extends DTO {

    /**
     * 定义编码
     */
    @Schema(description = "定义编码")
    private String processDefinitionId;

    /**
     * 定义名称
     */
    @Schema(description = "定义名称")
    private String processDefinitionName;

    /**
     * 定义key
     */
    @Schema(description = "定义key")
    private String processDefinitionKey;

    /**
     * 定义版本
     */
    @Schema(description = "定义版本")
    private Integer processDefinitionVersion;

    /**
     * 部署ID
     */
    @Schema(description = "部署ID")
    private String deploymentId;

    /**
     * 业务KEY
     */
    @Schema(description = "业务KEY")
    private String businessKey;

    /**
     * 是否挂起
     */
    @Schema(description = "是否挂起")
    private Boolean isSuspended;

    /**
     * 过程变量
     */
    @Schema(description = "过程变量")
    private Map<String, Object> processVariables;

    /**
     * 名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;

    /**
     * 开始时间
     */
    @Schema(description = "开始时间")
    private Date startTime;

    /**
     * 发起用户ID
     */
    @Schema(description = "发起用户ID")
    private String startUserId;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 实例编码
     */
    @Schema(description = "实例编码")
    private String processInstanceId;



}
