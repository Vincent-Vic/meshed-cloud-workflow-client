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
     * 用户id
     */
    private String userId;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 实例id
     */
    private String processInstanceId;
    /**
     * 评论类型
     */
    private String type;
    /**
     * 评论信息
     */
    private String message;
}
