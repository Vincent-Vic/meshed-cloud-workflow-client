package cn.meshed.cloud.workflow.engine.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum ActiveStatusEnum {

    /**
     * 活动
     */
    ACTIVE(1, "active"),

    /**
     * 挂起
     */
    SUSPENDED(2, "suspended"),

    ;

    private final int value;
    private final String key;
}
