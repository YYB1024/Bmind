package com.yupi.Bmind.model.dto.chart;


import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 图表更新请求
 *
 * @author yangyanbin
 * @date 2023/10/26
 * @since 20231026
 */
@Data
public class ChartUpdateRequest implements Serializable {


    private static final long serialVersionUID = -7722108640685889554L;
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

    /**
     * 生成的图表数据
     */
    private String genChart;

    /**
     * 生成的分析结论
     */
    private String genResult;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;



}
