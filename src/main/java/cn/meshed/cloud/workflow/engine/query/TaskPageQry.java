package cn.meshed.cloud.workflow.engine.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <h1>任务分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "任务分页查询")
public class TaskPageQry extends PageQuery {

    /** 名称 */
    @Schema(description = "名称")
    private String name;
    /** 分配人 */
    @Schema(description = "分配人")
    private String assignee;
    /** 分类 */
    @Schema(description = "分类")
    private String category;
    /** 在这个时间前完成 */
    @Schema(description = "在这个时间前完成")
    private Date createdBefore;
    /** 在这个时间后完成 */
    @Schema(description = "在这个时间后完成")
    private Date createdAfter;
}
