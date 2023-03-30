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
@Schema(description = "评论信息")
public class CommentDTO extends DTO {

    /**  ID */
    @Schema(description = "编码")
    private String id;

    /**
     * 评论
     */
    @Schema(description = "评论")
    private String fullMessage;

    /** 附件名称 */
    @Schema(description = "附件名称")
    private String attachmentName;

    /**  附件URL */
    @Schema(description = "附件URL")
    private String url;

    /** 用户ID */
    @Schema(description = "用户名称")
    private String userName;

    /** 时间 */
    @Schema(description = "时间")
    private Date time;

}
