

package com.pineapple.system.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pineapple.system.api.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典
 *
 * @author lyk
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {
	
}
