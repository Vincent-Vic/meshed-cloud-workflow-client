package cn.meshed.cloud.workflow.form;

import cn.meshed.cloud.workflow.flow.command.DraftCmd;
import cn.meshed.cloud.workflow.flow.data.DraftDTO;
import cn.meshed.cloud.workflow.flow.query.DraftPageQry;
import cn.meshed.cloud.workflow.form.command.FormCmd;
import cn.meshed.cloud.workflow.form.command.FormSchemaCmd;
import cn.meshed.cloud.workflow.form.data.FormDTO;
import cn.meshed.cloud.workflow.form.data.FormOptionDTO;
import cn.meshed.cloud.workflow.form.query.FormPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * <h1>草稿箱适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/form")
public interface FormAdapter {

    /**
     * 表单分页列表
     *
     * @param formPageQry 表单分页查询参数
     * @return {@link PageResponse<FormDTO>}
     */
    @Operation(summary = "表单分页列表")
    @GetMapping("/list")
    PageResponse<FormDTO> list(@Parameter(description = "流程定义分页查询参数") @Valid FormPageQry formPageQry);

    /**
     * 表单分页列表
     *
     * @return {@link PageResponse<FormOptionDTO>}
     */
    @Operation(summary = "表单选项列表")
    @GetMapping("/select")
    SingleResponse<List<FormOptionDTO>> select();

    /**
     * 保存表单
     *
     * @param formCmd 保存表单
     * @return {@link Response}
     */
    @Operation(summary = "保存表单")
    @PostMapping("/save")
    Response save(@Parameter(description = "表单参数") @Valid @RequestBody FormCmd formCmd);

    /**
     * 创建表单副本表单
     *
     * @param formId 表单唯一标识
     * @return {@link SingleResponse<String>}
     */
    @Operation(summary = "保存表单")
    @PostMapping("/copy/{formId}")
    SingleResponse<String> copy(@Parameter(description = "表单ID") @PathVariable("formId") String formId);

    /**
     * 保存表单数据
     *
     * @param formSchemaCmd 保存表单
     * @return {@link Response}
     */
    @Operation(summary = "保存表单数据")
    @PostMapping("/save/schema")
    Response saveSchema(@Parameter(description = "表单数据参数") @Valid @RequestBody FormSchemaCmd formSchemaCmd);

    /**
     * 获取表单设计数据
     *
     * @param formId 表单ID
     * @return {@link Response}
     */
    @Operation(summary = "获取表单设计数据")
    @PostMapping("/get/schema/{formId}")
    Response getSchemaById(@Parameter(description = "表单ID") @PathVariable("formId") String formId);

    /**
     * 获取表单设计数据
     *
     * @param key 表单唯一标识
     * @return {@link Response}
     */
    @Operation(summary = "获取表单设计数据")
    @PostMapping("/get/schema/key/{key}")
    Response getSchemaByKey(@Parameter(description = "表单唯一标识") @PathVariable("key") String key);

    /**
     * 发布表单
     *
     * @param formId 表单ID
     * @return {@link Response}
     */
    @Operation(summary = "发布表单")
    @PostMapping("/publish/{formId}")
    Response publish(@Parameter(description = "表单编码") @PathVariable("formId") String formId);

    /**
     * 废弃表单
     *
     * @param formId 表单ID
     * @return {@link Response}
     */
    @Operation(summary = "废弃表单")
    @PostMapping("/discard/{formId}")
    Response discard(@Parameter(description = "表单编码") @PathVariable("formId") String formId);

    /**
     * 检查表单标识是否可用
     *
     * @param key 表单标识
     * @return {@link Response}
     */
    @Operation(summary = "检查表单标识是否可用")
    @GetMapping("/available/key/{key}")
    Response availableKey(@Parameter(description = "表单唯一标识") @PathVariable("key") String key);
}
