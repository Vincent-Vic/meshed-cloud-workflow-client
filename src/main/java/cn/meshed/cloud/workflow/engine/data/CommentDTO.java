package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <h1>ProcessCommentVO或ProcessAttachmentVO结合对象</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class CommentDTO extends DTO {

    /**  ID */
    @Schema(description = "编码")
    private String id;

    /** 附件名称 */
    @Schema(description = "附件名称")
    private String attachmentName;
    
    /**
     * 评论
     */
    @Schema(description = "评论")
    private String fullMessage;

    /**
     * 类型：附件类型/评论/完成
     */
    @Schema(description = "类型：附件类型/评论/完成")
    private String type;

    /** 任务ID */
    @Schema(description = "任务ID")
    private String taskId;

    /** 实例ID  */
    @Schema(description = "实例ID")
    private String processInstanceId;

    /**  附件URL */
    @Schema(description = "附件URL")
    private String url;

    /** 用户ID */
    @Schema(description = "用户ID")
    private String userId;

    /** 时间 */
    @Schema(description = "时间")
    private Date time;
    

}
