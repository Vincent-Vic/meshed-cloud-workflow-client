package cn.meshed.cloud.workflow.engine.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <h1>附件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class AttachmentDTO extends DTO {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

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
     * 类型
     */
    @Schema(description = "类型")
    private String type;

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
     * URL
     */
    @Schema(description = "URL")
    private String url;

    /**
     * 用户ID
     */
    @Schema(description = "用户ID")
    private String userId;

    /**
     * 时间
     */
    @Schema(description = "时间")
    private Date time;
    

}
