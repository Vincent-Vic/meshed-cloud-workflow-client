package cn.meshed.cloud.workflow.flow;

import cn.meshed.cloud.workflow.flow.command.InitiateCmd;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
@RequestMapping("/flow")
public interface FlowAdapter {

    /**
     * 发起流程
     *
     * @param initiateCmd 流程设计数据
     * @return {@link Response}
     */
    @Operation(summary = "保存流程设计")
    @PostMapping("/initiate")
    Response initiate(@Parameter(description = "发起流程参数") @Valid @RequestBody InitiateCmd initiateCmd);
}
