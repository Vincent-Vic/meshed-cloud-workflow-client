package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>添加评论</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "添加评论")
public class CommentCmd extends Command {

    /**
     * 实例id
     */
    @Schema(description = "实例id")
    private String instanceId;
    /**
     * 评论信息
     */
    @Schema(description = "评论信息")
    private String message;
}
