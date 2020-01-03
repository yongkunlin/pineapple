

package com.pineapple.system.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pineapple.common.utils.PageUtils;
import com.pineapple.system.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author lyk
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
