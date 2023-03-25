package cn.meshed.cloud.workflow.flow;

import cn.meshed.cloud.workflow.engine.data.DefinitionDTO;
import cn.meshed.cloud.workflow.flow.command.DraftCmd;
import cn.meshed.cloud.workflow.flow.data.DraftDTO;
import cn.meshed.cloud.workflow.flow.query.DraftPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>草稿箱适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/draft")
public interface DraftAdapter {

    /**
     * 草稿列表
     *
     * @param draftPageQry 草稿分页查询参数
     * @return {@link PageResponse<DraftDTO>}
     */
    @Operation(summary = "流程定义列表")
    @GetMapping("/list")
    PageResponse<DraftDTO> list(@Parameter(description = "流程定义分页查询参数") @Valid DraftPageQry draftPageQry);

    /**
     * 新增草稿
     *
     * @param draftCmd 新增草稿
     * @return {@link Response}
     */
    @Operation(summary = "新增草稿")
    @PostMapping("/save")
    Response save(@Parameter(description = "草稿参数") @Valid @RequestBody DraftCmd draftCmd);
}
