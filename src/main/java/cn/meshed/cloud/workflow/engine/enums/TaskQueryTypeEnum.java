package cn.meshed.cloud.workflow.engine.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>任务查询类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum TaskQueryTypeEnum {

    /**
     * 待办任务
     */
    TODO(1, "TODO"),

    /**
     * 已办任务
     */
    COMPLETE(2, "COMPLETE"),

    /**
     * 发起记录
     */
    MY_INITIATION(2, "MY_INITIATION"),

    ;

    private final int value;
    private final String key;
}
