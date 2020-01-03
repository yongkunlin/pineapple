

package com.pineapple.system.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pineapple.common.utils.PageUtils;
import com.pineapple.system.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author lyk
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
