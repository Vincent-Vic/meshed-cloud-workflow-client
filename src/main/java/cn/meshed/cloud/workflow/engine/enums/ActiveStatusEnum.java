package cn.meshed.cloud.workflow.engine.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
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

    @EnumValue
    private final int value;
    private final String ext;
}
