package cn.meshed.cloud.workflow.engine.query;

import cn.meshed.cloud.workflow.engine.enums.ActiveStatusEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>实例分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "实例分页查询")
public class InstancePageQry extends PageQuery {

    /**
     * 实例名称
     */
    @Schema(description = "实例名称")
    private String name;
    /**
     * 部署ID
     */
    @Schema(description = "部署ID")
    private String deployId;
    /**
     * 实例活动状态
     */
    @Schema(description = "实例活动状态")
    private ActiveStatusEnum status;

}
