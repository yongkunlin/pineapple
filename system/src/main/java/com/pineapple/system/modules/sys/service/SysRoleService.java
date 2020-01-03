

package com.pineapple.system.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pineapple.common.utils.PageUtils;
import com.pineapple.system.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 角色
 *
 * @author lyk
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
