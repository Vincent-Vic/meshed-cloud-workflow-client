package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

/**
 * <h1>完成任务</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "完成任务")
public class CompleteTaskCmd extends Command {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 编码ID
     */
    private String taskId;
    /**
     * 实例ID
     */
    private String processInstanceId;
    /**
     * 完成任务携带参数
     */
    private Map<String, Object> param;
    /**
     * 完成携带信息
     */
    private String message;

}
