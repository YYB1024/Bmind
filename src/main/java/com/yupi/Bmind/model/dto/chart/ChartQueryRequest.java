package com.yupi.Bmind.model.dto.chart;


import com.yupi.Bmind.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * 图表查询请求
 *
 * @author yangyanbin
 * @date 2023/10/26
 * @since 20231026
 */
@Data
public class ChartQueryRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = -7041822220277959032L;

    /**
     * id
     */
    private Long id;
    /**
     * 分析目标
     */
    private String goal;

    /**
     * 创建用户id
     */
    private Long userId;

    /**
     * 图表类型
     */
    private String chartType;

}
