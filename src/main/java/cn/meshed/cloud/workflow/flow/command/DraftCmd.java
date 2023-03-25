package cn.meshed.cloud.workflow.flow.command;

import cn.meshed.cloud.workflow.flow.enums.FormTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * <h1>草稿保存模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "草稿保存模型")
public class DraftCmd extends Command {

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String id;

    /**
     * 分类
     */
    @Schema(description = "唯一值")
    @NotBlank(message = "唯一值不能为空")
    private String key;

    /**
     * 分类
     */
    @Schema(description = "分类")
    @NotBlank(message = "分类不能为空")
    private String category;

    /**
     * 流程名称
     */
    @Schema(description = "流程名称")
    @NotBlank(message = "流程名称不能为空")
    private String name;

    /**
     * 名称
     */
    @Schema(description = "表单类型")
    @NotEmpty(message = "表单类型不能为空")
    private FormTypeEnum formType;

    /**
     * 表单ID
     */
    @Schema(description = "表单ID（表单类型时必须存在）")
    private String formId;

    /**
     * 表单Url
     */
    @Schema(description = "表单HTTP（iframe类型时必须存在）")
    private String formUrl;

    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;


}
