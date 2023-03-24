package cn.meshed.cloud.workflow.engine;

import cn.meshed.cloud.workflow.engine.command.InitiateInstanceCmd;
import cn.meshed.cloud.workflow.engine.command.InstanceDestroyCmd;
import cn.meshed.cloud.workflow.engine.data.InstanceDTO;
import cn.meshed.cloud.workflow.engine.query.InstancePageQry;
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
 * <h1>流程实例适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/engine/instance")
public interface InstanceAdapter {

    /**
     * 流程实例列表
     *
     * @param instancePageQry 流程实例分页查询参数
     * @return {@link PageResponse < DefinitionDTO >}
     */
    @Operation(summary = "流程实例列表")
    @GetMapping("/list")
    PageResponse<InstanceDTO> list(@Parameter(description = "流程实例分页查询参数") @Valid InstancePageQry instancePageQry);

    /**
     * 启动流程实例
     *
     * @param initiateInstanceCmd 发起实例参数
     * @return 实例ID
     */
    @Operation(summary = "启动流程实例")
    @PostMapping("/initiate")
    SingleResponse<String> initiate(@Parameter(description = "启动流程实例参数") @RequestBody @Valid InitiateInstanceCmd initiateInstanceCmd);

    /**
     * 销毁实例
     *
     * @param instanceDestroyCmd 销毁命令
     * @return {@link Response}
     */
    @Operation(summary = "销毁实例")
    @PostMapping("/destroy")
    Response destroy(@Parameter(description = "销毁实例参数") @RequestBody @Valid InstanceDestroyCmd instanceDestroyCmd);

    /**
     * 反转状态
     *
     * @param instanceId 流程定义编码
     * @return {@link Response}
     */
    @Operation(summary = "反转状态")
    @PostMapping("/inverted/state/{instanceId}")
    Response invertedState(@Parameter(description = "实例ID") @PathVariable("instanceId") String instanceId);
}
