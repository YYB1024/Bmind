package com.yupi.Bmind.model.dto.chart;


import lombok.Data;

import java.io.Serializable;

/**
 * 图表添加请求
 *
 * @author yangyanbin
 * @date 2023/10/26
 * @since 20231026
 */
@Data
public class ChartAddRequest implements Serializable {
    private static final long serialVersionUID = 6742482939774416657L;
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
