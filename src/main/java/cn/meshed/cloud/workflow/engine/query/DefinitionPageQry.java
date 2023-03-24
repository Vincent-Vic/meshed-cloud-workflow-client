package cn.meshed.cloud.workflow.engine.query;

import cn.meshed.cloud.workflow.engine.enums.ActiveStatusEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>流程分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "流程定义分页查询")
public class DefinitionPageQry extends PageQuery {

    @Schema(description = "流程名称")
    private String name;
    @Schema(description = "流程分类")
    private String category;
    @Schema(description = "流程状态：活动/挂起")
    private ActiveStatusEnum status;
}
