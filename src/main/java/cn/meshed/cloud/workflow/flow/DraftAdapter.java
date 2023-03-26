package cn.meshed.cloud.workflow.flow;

import cn.meshed.cloud.workflow.engine.data.DefinitionDTO;
import cn.meshed.cloud.workflow.flow.command.DraftCmd;
import cn.meshed.cloud.workflow.flow.data.DraftDTO;
import cn.meshed.cloud.workflow.flow.query.DraftPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>流程草稿箱适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/flow/draft")
public interface DraftAdapter {

    /**
     * 流程草稿列表
     *
     * @param draftPageQry 草稿分页查询参数
     * @return {@link PageResponse<DraftDTO>}
     */
    @Operation(summary = "流程草稿列表")
    @GetMapping("/list")
    PageResponse<DraftDTO> list(@Parameter(description = "流程定义分页查询参数") @Valid DraftPageQry draftPageQry);

    /**
     * 流程草稿详情
     *
     * @param draftId 草稿ID
     * @return {@link PageResponse<DraftDTO>}
     */
    @Operation(summary = "流程草稿详情")
    @GetMapping("/query")
    SingleResponse<DraftDTO> query(@Parameter(description = "草稿ID") @PathVariable("draftId") String draftId);

    /**
     * 新增草稿
     *
     * @param draftCmd 新增草稿
     * @return {@link Response}
     */
    @Operation(summary = "新增草稿")
    @PostMapping("/save")
    Response save(@Parameter(description = "草稿参数") @Valid @RequestBody DraftCmd draftCmd);

    /**
     * 发布流程
     *
     * @param draftId 草稿ID
     * @return {@link Response}
     */
    @Operation(summary = "发布流程")
    @PostMapping("/publish/{draftId}")
    Response publish(@Parameter(description = "草稿ID") @PathVariable("draftId") String draftId);

}
