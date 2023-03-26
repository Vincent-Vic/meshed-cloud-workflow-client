package cn.meshed.cloud.workflow.form.data;

import cn.meshed.cloud.workflow.form.enums.FormStatusEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>表单模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "表单选项模型")
public class FormOptionDTO extends DTO {

    /**
     * ID
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 表单名称
     */
    @Schema(description = "表单名称")
    private String name;

    /**
     * 表单版本
     */
    @Schema(description = "表单版本")
    private Integer version;

}
