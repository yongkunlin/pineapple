

package com.pineapple.system.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pineapple.system.api.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色管理
 *
 * @author lyk
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	

}
