package cn.meshed.cloud.workflow.engine;

import cn.meshed.cloud.workflow.engine.data.DefinitionDTO;
import cn.meshed.cloud.workflow.engine.query.DefinitionPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>流程定义适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/engine/definition")
public interface DefinitionAdapter {

    /**
     * 流程定义列表
     *
     * @param definitionPageQry 流程定义分页查询参数
     * @return {@link PageResponse<DefinitionDTO>}
     */
    @Operation(summary = "流程定义列表")
    @GetMapping("/list")
    PageResponse<DefinitionDTO> list(@Parameter(description = "流程定义分页查询参数") @Valid DefinitionPageQry definitionPageQry);

    /**
     * 反转状态
     *
     * @param definitionId 流程定义编码
     * @return {@link Response}
     */
    @Operation(summary = "反转状态")
    @PostMapping("/inverted/state/{processDefinitionId}")
    Response invertedState(@Parameter(description = "实例ID") @PathVariable("definitionId") String definitionId);
}
