package cn.meshed.cloud.workflow.flow.enums;

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
public enum FormTypeEnum {

    /**
     * 表单
     */
    NONE(0, "none"),
    /**
     * 表单
     */
    FORM(1, "form"),
    /**
     * iframe
     */
    IFRAME(2, "iframe"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
