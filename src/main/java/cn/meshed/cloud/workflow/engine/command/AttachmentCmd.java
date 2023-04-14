package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>添加附件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "添加附件")
public class AttachmentCmd extends Command {

    /**
     * 用户ID
     */
    @Schema(description = "用户ID")
    private String userId;
    /**
     * 附件类型
     */
    @Schema(description = "附件类型")
    private String attachmentType;
    /**
     * 任务ID
     */
    @Schema(description = "任务ID")
    private String taskId;
    /**
     * 实例ID
     */
    @Schema(description = "实例ID")
    private String processInstanceId;
    /**
     * 附件名称
     */
    @Schema(description = "附件名称")
    private String attachmentName;
    /**
     * 附件详情
     */
    @Schema(description = "附件详情")
    private String attachmentDescription;
    /**
     * 附件URL
     */
    @Schema(description = "附件URL")
    private String url;
}
