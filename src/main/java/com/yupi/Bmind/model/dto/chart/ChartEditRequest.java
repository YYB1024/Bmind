package com.yupi.Bmind.model.dto.chart;


import lombok.Data;

import java.io.Serializable;

/**
 * 图表编辑请求
 * @author yangyanbin
 * @date 2023/10/26
 * @since 20231026
 */
@Data
public class ChartEditRequest implements Serializable {


    private static final long serialVersionUID = -3166810511625539578L;
    private Long id;
    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartData;

    /**
     * 图表类型
     */
    private String chartType;

}
