package cn.meshed.cloud.workflow.form.query;

import cn.meshed.cloud.workflow.form.enums.FormStatusEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>表单查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "表单分页查询")
public class FormPageQry extends PageQuery {

    /**
     * 关键字
     */
    @Schema(description = "关键字")
    private String keyword;

    /**
     * 表单状态
     */
    @Schema(description = "表单状态")
    private FormStatusEnum status;
}
