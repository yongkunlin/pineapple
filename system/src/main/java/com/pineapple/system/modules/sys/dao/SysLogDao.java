

package com.pineapple.system.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pineapple.system.api.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author lyk
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
