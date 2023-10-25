package com.yupi.Bmind.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.Bmind.model.entity.Chart;
import com.yupi.Bmind.service.ChartService;
import com.yupi.Bmind.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author yangyb
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-10-25 16:37:45
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




