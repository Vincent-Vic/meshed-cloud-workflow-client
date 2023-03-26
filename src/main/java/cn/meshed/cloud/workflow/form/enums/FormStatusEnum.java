package cn.meshed.cloud.workflow.form.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>表单状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum FormStatusEnum {

    /**
     * 编辑中
     */
    EDIT(0, "edit"),
    /**
     * 运行中
     */
    RUN(1, "run"),
    /**
     * iframe
     */
    DISCARD(2, "discard"),

    ;

    private final int value;
    private final String key;
}
