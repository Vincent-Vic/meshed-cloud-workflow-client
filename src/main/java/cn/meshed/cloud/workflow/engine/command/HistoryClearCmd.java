package cn.meshed.cloud.workflow.engine.command;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * <h1>历史清除命令</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@Schema(description = "历史清除命令")
public class HistoryClearCmd {

    @Schema(description = "实例编码列表")
    @NotEmpty(message = "清除选项不能为空")
    private Set<String> instanceIds;
}
