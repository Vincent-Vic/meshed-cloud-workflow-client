package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class TaskActivityDTO extends DTO {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 活动名称
     */
    @Schema(description = "活动名称")
    private String activityName;

    /**
     * 分配人名称
     */
    @Schema(description = "分配人名称")
    private String assigneeName;

    /**
     * 节点附带消息
     */
    @Schema(description = "节点附带消息")
    private String fullMessage;

    /**
     * 节点审批结束时间
     */
    @Schema(description = "节点审批开始时间")
    private Date startTime;

    /**
     * 节点审批结束时间
     */
    @Schema(description = "节点审批结束时间")
    private Date endTime;
    /**
     * 用时
     */
    @Schema(description = "用时")
    private Long durationInMillis;
}
