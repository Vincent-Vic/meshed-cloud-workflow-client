package cn.meshed.cloud.workflow.engine;

import cn.meshed.cloud.workflow.engine.command.HistoryClearCmd;
import cn.meshed.cloud.workflow.engine.data.HistoryDTO;
import cn.meshed.cloud.workflow.engine.query.HistoryPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>历史任务适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/history")
public interface HistoryAdapter {

    /**
     * 历史任务列表
     *
     * @param historyPageQry 流程实例分页查询参数
     * @return {@link PageResponse < DefinitionDTO >}
     */
    @Operation(summary = "历史任务列表")
    @GetMapping("/list")
    PageResponse<HistoryDTO> list(@Parameter(description = "历史任务分页查询参数") @Valid HistoryPageQry historyPageQry);

    /**
     * 批量清理历史实例
     *
     * @param historyClearCmd 清理历史命令
     * @return {@link Response}
     */
    @Operation(summary = "批量清理历史实例")
    @DeleteMapping("/clear")
    Response clear(@Parameter(description = "批量清理历史参数") @RequestBody @Valid HistoryClearCmd historyClearCmd);
}
