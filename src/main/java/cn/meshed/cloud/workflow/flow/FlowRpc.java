package cn.meshed.cloud.workflow.flow;

import cn.meshed.cloud.workflow.flow.command.InitiateCmd;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;

import java.io.Serializable;

/**
 * <h1>设计器RPC</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface FlowRpc extends Serializable {

    long serialVersionUID = 1L;

    /**
     * 发起流程
     *
     * @param initiateCmd 流程设计数据
     * @return {@link Response}
     */
    SingleResponse<String> initiate(InitiateCmd initiateCmd);
}
