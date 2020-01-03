

package com.pineapple.system.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pineapple.system.api.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author lyk
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
