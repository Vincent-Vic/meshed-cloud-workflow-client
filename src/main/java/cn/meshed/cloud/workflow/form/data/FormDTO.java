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
@Schema(description = "表单模型")
public class FormDTO extends DTO {

    /**
     * ID
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 表单key
     */
    @Schema(description = "表单key")
    private String key;

    /**
     * 表单名称
     */
    @Schema(description = "表单名称")
    private String name;

    /**
     * 表单描述
     */
    @Schema(description = "表单描述")
    private String description;

    /**
     * 表单版本
     */
    @Schema(description = "表单版本")
    private Integer version;

    /**
     * 表单状态
     */
    @Schema(description = "表单状态")
    private FormStatusEnum status;
}
