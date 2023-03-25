package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * <h1>历史清除命令</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "历史清除命令")
public class HistoryClearCmd extends Command {

    @Schema(description = "实例编码列表")
    @NotEmpty(message = "清除选项不能为空")
    private Set<String> instanceIds;
}
