package cn.meshed.cloud.workflow.engine.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
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
     * 历史任务
     */
    HISTORY(2, "HISTORY"),

    /**
     * 发起记录
     */
    MY(2, "MY"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
