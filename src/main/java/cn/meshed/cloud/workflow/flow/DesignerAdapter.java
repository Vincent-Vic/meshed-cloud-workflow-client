package cn.meshed.cloud.workflow.flow;

import cn.meshed.cloud.workflow.flow.command.DesignerCmd;
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
 * <h1>设计器适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/flow/designer")
public interface DesignerAdapter {

    /**
     * 流程设计数据
     *
     * @param flowId 流程ID
     * @return {@link SingleResponse<String>}
     */
    @Operation(summary = "流程设计数据")
    @GetMapping("/{flowId}")
    SingleResponse<String> getDesigner(@Parameter(description = "流程ID") @PathVariable("flowId") String flowId);

    /**
     * 保存流程设计
     *
     * @param designerCmd 流程设计数据
     * @return {@link Response}
     */
    @Operation(summary = "保存流程设计")
    @PostMapping("/save")
    Response save(@Parameter(description = "流程设计参数") @Valid @RequestBody DesignerCmd designerCmd);
}
